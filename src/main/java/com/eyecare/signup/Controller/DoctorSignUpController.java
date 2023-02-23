package com.eyecare.signup.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eyecare.signup.Entities.DoctorSignUp;
import com.eyecare.signup.Services.DoctorSignUpService;

@RestController
@RequestMapping("/register")
public class DoctorSignUpController {

	private DoctorSignUpService drService;
	public DoctorSignUpController(DoctorSignUpService drService) {
		super();
		this.drService = drService;
	}
	
	@GetMapping("/home")
	public String home() { 
		return"this is home";
	}
	
	@GetMapping("")
	public List<DoctorSignUp> getDoctors(){
		return drService.getDoctors();
	}
	
	@PostMapping("")
	public ResponseEntity<DoctorSignUp> addDoctor(@RequestBody DoctorSignUp dr){
		return new ResponseEntity<DoctorSignUp>(drService.addDoctor(dr),HttpStatus.CREATED);
	}
}
