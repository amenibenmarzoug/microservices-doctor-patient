package com.eniso.pm.servicedoctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eniso.pm.servicedoctor.entities.Doctor;
import com.eniso.pm.servicedoctor.repository.DoctorRepository;
import com.eniso.pm.servicedoctor.service.DoctorService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@ComponentScan(basePackageClasses = DoctorService.class)
@RequestMapping(value = "/api")
public class DoctorController {
	
	@Autowired
	DoctorRepository doctorRepository;
	
	DoctorService doctorService;
	
	@Autowired
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	} 

	@GetMapping("/doctors")
	public List<Doctor> findAll() {
		return doctorService.findAll();
	}
	
	@GetMapping("doctors/{doctorId}")
	public Doctor getDoctor(@PathVariable Long id) {
		
		Doctor d = doctorService.findById(id);
		
		if (d == null) {
			throw new RuntimeException("Doctor id not found - " + id);
		}
		
		return d;
	}

	@PostMapping("/addDoctor")
	public  Doctor addDoctor(@RequestBody Doctor d) {
	
		doctorService.save(d);
		return d;
	}
	
		
	@PutMapping("/updatedoctor")
	public Doctor updateDoctor(@RequestBody Doctor d) {
		
		doctorService.save(d);
		
		return d;
	}

	@DeleteMapping("/doctors/{doctorId}")
	public String deleteDoctor(@PathVariable Long id) {
		
		Doctor p = doctorService.findById(id);
		
		if (p == null) {
			throw new RuntimeException("the doctor id not found - " + id);
		}
		
		doctorService.deleteById(id);
		
		return "Deleted doctor id - " + id;
	}

}
