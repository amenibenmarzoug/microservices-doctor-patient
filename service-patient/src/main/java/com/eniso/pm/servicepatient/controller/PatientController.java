package com.eniso.pm.servicepatient.controller;

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

import com.eniso.pm.servicepatient.entity.Patient;
import com.eniso.pm.servicepatient.service.PatientService;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
@ComponentScan(basePackageClasses = PatientService.class )
@RequestMapping(value="/api")

public class PatientController {



	@Autowired
	private PatientService ps;
	@Autowired
	public PatientController(PatientService patientService) {
	ps = patientService;
	} 
	//public ControlController () {}
	


	@GetMapping("/patients")
	public List<Patient> findAll() {
		return ps.findAll();
	}
	
	@GetMapping("patients/{patientId}")
	public Patient getPatient(@PathVariable Long PatientlId) {
		
		Patient p = ps.findById(PatientlId);
		
		if (p == null) {
			throw new RuntimeException("Patient id not found - " + PatientlId);
		}
		
		return p;
	}
	// add mapping for POST /controls - add new control

	@PostMapping("patients/addPatient")
	public  Patient addpatient(@RequestBody Patient p) {
	
		 ps.save(p);
		return p;
	}
	
	
	// add mapping for PUT /employees - update existing employee
	
		@PutMapping("/patients")
		public Patient updatePatient(@RequestBody Patient p) {
			
			ps.save(p);
			
			return p;
		}

		@DeleteMapping("/patients/{patientId}")
		public String deletePatient(@PathVariable Long id) {
			
			Patient p = ps.findById(id);
			
			// throw exception if null
			
			if (p == null) {
				throw new RuntimeException("the patient id not found - " + id);
			}
			
			ps.deleteById(id);
			
			return "Deleted patient id - " + id;
		}
		
}

