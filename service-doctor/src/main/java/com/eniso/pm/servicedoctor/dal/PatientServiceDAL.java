/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.pm.servicedoctor.dal;

import com.eniso.pm.servicedoctor.dto.PatientDto;
import com.eniso.pm.servicedoctor.service.MicroservicesURL;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author eya
 */
@Component
public class PatientServiceDAL {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    public List<PatientDto> getPatients() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity<String>(headers);
        PatientDto[] pl = restTemplate.getForEntity(MicroservicesURL.PATIENT_SERVICE_URL.concat("/patients"), PatientDto[].class).getBody();
        return Arrays.asList(pl);
    }
}
