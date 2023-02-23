package com.eyecare.signup.Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.eyecare.signup.Entities.DoctorSignUp;
import com.eyecare.signup.Repository.DoctorSignUpRepository;


@Service
public class DoctorSignUpImpl implements DoctorSignUpService{
	
	List<DoctorSignUp> list;
	public DoctorSignUpImpl() {
		list = new ArrayList<>();
		list.add(new DoctorSignUp(1,"Rutuja","Jadhav","rutuja@gmail.com","Pune","Female","Doctor","7768098324","DR12345","rutuja123","rutuja123"));
	}
	
	private DoctorSignUpRepository drRepository;
	
	public DoctorSignUpImpl(DoctorSignUpRepository drRepository) {
		super();
		this.drRepository = drRepository;
	}
	@Override
	public List<DoctorSignUp> getDoctors() {
		return drRepository.findAll();
	}
	
	@Override
	public DoctorSignUp addDoctor(DoctorSignUp dr) {
		return drRepository.save(dr);
		
	}
}
