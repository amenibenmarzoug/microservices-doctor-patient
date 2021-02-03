package com.eniso.pm.servicepatient.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eniso.pm.servicepatient.entity.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
