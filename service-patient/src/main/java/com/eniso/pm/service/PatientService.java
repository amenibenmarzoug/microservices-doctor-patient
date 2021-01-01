package com.eniso.pm.service;

import java.util.List;

import com.eniso.pm.entity.Patient;





public interface PatientService {

	public List<Patient> findAll();
	
	public Patient findById(Long  theId);
	
	public void save(Patient p);
	
	public void deleteById(Long  theId);
}
