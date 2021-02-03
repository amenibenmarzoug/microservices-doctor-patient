package com.eniso.pm.servicepatient.service;

import java.util.List;

import com.eniso.pm.servicepatient.entity.DossierMedical;

public interface DossierMedicalService {
public List<DossierMedical> findAll();
	
	public DossierMedical findById(Long  theId);
	
	public void save(DossierMedical d);
	
	public void deleteById(Long  theId);

}
