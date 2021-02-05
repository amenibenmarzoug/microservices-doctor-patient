package com.eniso.pm.servicedoctor.entities;

import java.io.Serializable;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="doctor")

@PrimaryKeyJoinColumn(name = "doctor_id")

public class Doctor implements Serializable {
	
	@Id
    @GeneratedValue
    private long doctor_id;


	public void setDoctor_id(long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public long getDoctor_id() {
		return doctor_id;
	}

	

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

	public Doctor() {
	
	}

	public Doctor(int doctor_id, String firstName, String lastName, String gender, String email, String address,
			String specialisation) {
		
		this.doctor_id = doctor_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.specialisation = specialisation;
	}

}
