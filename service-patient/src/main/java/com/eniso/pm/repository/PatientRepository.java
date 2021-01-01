package com.eniso.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eniso.pm.entity.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
