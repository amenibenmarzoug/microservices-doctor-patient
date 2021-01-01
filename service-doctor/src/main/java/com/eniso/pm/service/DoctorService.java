package com.eniso.pm.service;

import java.util.List;

import com.eniso.pm.entities.Doctor;


public interface DoctorService {
	
	public List<Doctor> findAll();
	public Doctor findById(long id);
	public List<Doctor> findBySpecialisation(String specialisation);
	public void save(Doctor doctor);	
	public void deleteById(long id);
}
