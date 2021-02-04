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

import com.eniso.pm.servicedoctor.dal.PatientServiceClient;
import com.eniso.pm.servicedoctor.dal.PatientServiceDAL;
import com.eniso.pm.servicedoctor.dto.PatientDto;

import com.eniso.pm.servicedoctor.entities.Doctor;
import com.eniso.pm.servicedoctor.repository.DoctorRepository;
import com.eniso.pm.servicedoctor.service.DoctorService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@CrossOrigin("*")
@CrossOrigin(origins = "http://localhost:4200")

@RestController
@ComponentScan(basePackageClasses = DoctorService.class)
@RequestMapping(value = "/api")
public class DoctorController {

//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
    
      @Bean
    public PatientServiceDAL getPatientServiceDAL() {
        return new PatientServiceDAL();
    }
	@Autowired
	PatientServiceClient patientService;
      
//	@Autowired
//	RestTemplate restTemplate;

	@Autowired
	DoctorRepository doctorRepository;
	@Autowired

	DoctorService doctorService;

	@Autowired
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
//
//	@RequestMapping(value = "/template/patients")
//	public String getPatiens() {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//
//		return restTemplate.exchange(MicroservicesURL.PATIENT_SERVICE_URL.concat("/api/patients"), HttpMethod.GET,
//				entity, String.class).getBody();
//	}
//
//	@RequestMapping(value = "/template/addPatient")
//	public String addPatiens(@RequestBody PatientDto p) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//
//		return restTemplate.exchange(MicroservicesURL.PATIENT_SERVICE_URL.concat("/api/patients/addPatient"),
//				HttpMethod.POST, entity, String.class).getBody();
//	}
//
//	@RequestMapping(value = "/template/editPatient")
//	public String editPatiens() {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//
//		return restTemplate.exchange(MicroservicesURL.PATIENT_SERVICE_URL.concat("/api/patients"), HttpMethod.PUT,
//				entity, String.class).getBody();
//	}
//
//	@RequestMapping(value = "/template/deletePatient/{id}")
//	public String deletePatiens(@PathVariable long id) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//
//		return restTemplate.exchange(MicroservicesURL.PATIENT_SERVICE_URL.concat("/api/patients/{id}"),
//				HttpMethod.DELETE, entity, String.class).getBody();
//	}

	@RequestMapping(value = "/patients")
	public List<PatientDto> listDesPatients() {
		return doctorService.getPatients();
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

	@PostMapping("doctors/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor d) {

		doctorService.save(d);
		return d;
	}

	@PutMapping("doctors/updatedoctor")
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
