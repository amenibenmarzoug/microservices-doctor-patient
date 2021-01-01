package com.eniso.pm.entities;

import javax.persistence.*;

@Entity
@Table(name="doctor")
@PrimaryKeyJoinColumn(name = "doctor_id")
public class Doctor {
	
	@Column(name = "firstName")
	private String firstName;

	
	@Column(name = "lastName")
	private String lastName;
	
	
	@Column(name = "gender")
	private String gender;
	
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "address")
	private String address ;
	

	@Column(name = "specialisation")
	private String specialisation ;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

}
