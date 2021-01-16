package com.eniso.pm.servicedoctor.service;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.eniso.pm.servicedoctor.entities.Doctor;
import com.eniso.pm.servicedoctor.repository.DoctorRepository;


@Service
@ComponentScan(basePackageClasses = DoctorRepository.class )
public class DoctorServiceImpl implements DoctorService {
	
	@PersistenceContext
	
	private EntityManager entityManager; 
	
	@Autowired
	private DoctorRepository doctorRepository;
	private List<Doctor> doctors;
	
	public DoctorServiceImpl() {

	}
	

	public DoctorServiceImpl(DoctorRepository doctorRepository, List<Doctor> doctors) {
		super();
		this.doctorRepository = doctorRepository;
		this.doctors = doctors;
	}


	@Autowired
	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}
	
	@Override
	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor findById(long id) {
		Optional<Doctor> result = doctorRepository.findById(id);
		
		Doctor doctor = null;
		
		if (result.isPresent()) {
			doctor = result.get();
		}
		else {
			throw new RuntimeException("Did not find doctor id - " + id);
		}
		
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialisation(String specialisation) {
		doctors = null;
		
		

		for(Doctor d:doctorRepository.findAll()) {
			
			
		if  (d.getSpecialisation()== specialisation) {
    	  
			doctors.add(d) ;
		
      }
	            	
	}
		return doctors;
	}

	@Override
	public void save(Doctor doctor) {
		doctorRepository.save(doctor);
		
	}

	@Override
	public void deleteById(long id) {
		doctorRepository.deleteById(id);
		
	}

}
