package com.eniso.pm.servicepatient.service;

import java.util.List;

import com.eniso.pm.servicepatient.entity.Patient;





public interface PatientService {

	public List<Patient> findAll();
	
	public Patient findById(Long  theId);
	
	public void save(Patient p);
	
	public void deleteById(Long  theId);
}
