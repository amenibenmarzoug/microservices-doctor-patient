package com.eniso.pm.servicepatient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.eniso.pm.servicepatient.entity.DossierMedical;
import com.eniso.pm.servicepatient.entity.Patient;
import com.eniso.pm.servicepatient.repository.DossierMedicalRepository;
import com.eniso.pm.servicepatient.repository.PatientRepository;

@Service
@ComponentScan(basePackageClasses = DossierMedicalRepository.class )
public class DossierMedicalServiceImpl implements DossierMedicalService{
	
private DossierMedicalRepository dossierMedicalRepository;
	
	public DossierMedicalServiceImpl () {}
	
	@Autowired
	public DossierMedicalServiceImpl(DossierMedicalRepository dRepository) {
		dossierMedicalRepository = dRepository;
	}
	@Override
	public List<DossierMedical> findAll() {
		return dossierMedicalRepository.findAll();
	}

	@Override
	public DossierMedical findById(Long theId) {
		Optional<DossierMedical> result = dossierMedicalRepository.findById(theId);
		
		DossierMedical p = null;
		
		if (result.isPresent()) {
			p = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find DossierMedical id - " + theId);
		}
		
		return p;
	}

	@Override
	public void save(DossierMedical d) {
		dossierMedicalRepository.save(d);
		
	}

	@Override
	public void deleteById(Long theId) {
		dossierMedicalRepository.deleteById(theId);
		
	}

}
