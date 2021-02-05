package com.eniso.pm.servicedoctor.dal;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eniso.pm.servicedoctor.service.MicroservicesURL;
import com.eniso.pm.servicedoctor.dto.PatientDto;


@FeignClient(name = "service-patient", url = MicroservicesURL.PATIENT_SERVICE_URL)

public interface PatientServiceClient {

	@GetMapping(value = "/patients")
	List<PatientDto> listeDesPatients();

	@GetMapping( value = "/patient/{id}")
	PatientDto recupererUnPatient(@PathVariable("id") int id);

	}
