package com.eniso.pm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.eniso.pm.entity.Patient;
import com.eniso.pm.repository.PatientRepository;






@Service
@ComponentScan(basePackageClasses = PatientRepository.class )
public class PatientServiceImpl implements  PatientService  {

	private PatientRepository patientRepository;
	
	public PatientServiceImpl () {}

	@Autowired
	public PatientServiceImpl(PatientRepository pRepository) {
		patientRepository = pRepository;
	}
	
	@Override
	public List<Patient> findAll() {
		return patientRepository.findAll();
	}

	@Override
	public Patient findById(Long  theId) {
		Optional<Patient> result = patientRepository.findById(theId);
		
		Patient p = null;
		
		if (result.isPresent()) {
			p = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find patient id - " + theId);
		}
		
		return p;
	}

	@Override
	public void save(Patient p) {
		patientRepository.save(p);
	}

	@Override
	public void deleteById(Long   theId) {
		patientRepository.deleteById(theId);
	}

}






