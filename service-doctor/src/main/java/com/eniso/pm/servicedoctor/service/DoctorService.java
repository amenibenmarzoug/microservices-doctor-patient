package com.eniso.pm.servicedoctor.service;

import com.eniso.pm.servicedoctor.dto.PatientDto;
import java.util.List;

import com.eniso.pm.servicedoctor.entities.Doctor;


public interface DoctorService {
	
	public List<Doctor> findAll();
	public Doctor findById(long id);
	public List<Doctor> findBySpecialisation(String specialisation);
	public void save(Doctor doctor);	
	public void deleteById(long id);
        public List<PatientDto> getPatients();
}
