package com.eyecare.signup.Entities;

import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="doctor")
public class DoctorSignUp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "first_name")
	//@NotEmpty(message = "Please provide your first name")
	private String first_name;
	
	@Column(name = "last_name")
	//@NotEmpty(message = "Please provide your last name")
	private String last_name;
	
	@Column(name = "email", nullable = false, unique = true)
	//@Email(message = "Please provide a valid e-mail")
	//@NotEmpty(message = "Please provide your e-mail")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name = "phone_no")
	private String phoneNo;
	
	@Column(name = "license_no")
	//@NotEmpty(message = "Please provide Registration Number")
	private String licenseNo;
	
	@Column(name = "password")
	@Transient
	private String password;
	
	@Column(name = "confirm_password")
	@Transient
	private String confirmPassword;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
	public DoctorSignUp(Integer id, String first_name, String last_name, String email, String address, String gender, String designation,
			String phoneNo, String licenseNo, String password, String confirmPassword) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.designation = designation;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	
	
	public DoctorSignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DoctorSignUp [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", address=" + address + ", gender=" + gender + ", designation=" + designation + ", phoneNo="
				+ phoneNo + ", licenseNo=" + licenseNo + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
	
	
	
	
}
