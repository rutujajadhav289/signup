package com.eyecare.signup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eyecare.signup.Entities.DoctorSignUp;




@Repository("doctorRepository")
public interface DoctorSignUpRepository extends CrudRepository<DoctorSignUp, Integer>, JpaRepository<DoctorSignUp, Integer>{

}