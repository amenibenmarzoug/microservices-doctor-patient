package com.eniso.pm.servicepatient.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;


@Entity
@Table(name="dossier")
//@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class DossierMedical implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(max = 10)
    private String bloodType;

    @NotBlank
    @Size(max = 50)
    @Email
    private String diagnosis;

    @NotBlank
    @Size(max = 120)
    private String coronaTest;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getCoronaTest() {
        return coronaTest;
    }

    public void setCoronaTest(String coronaTest) {
        this.coronaTest = coronaTest;
    }






}
