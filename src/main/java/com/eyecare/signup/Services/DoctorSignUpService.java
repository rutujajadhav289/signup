package com.eyecare.signup.Services;

import java.util.List;

import com.eyecare.signup.Entities.DoctorSignUp;

public interface DoctorSignUpService {

	List<DoctorSignUp> getDoctors();

	DoctorSignUp addDoctor(DoctorSignUp dr);

}
