package com.eniso.pm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eniso.pm.entities.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	
		Optional<Doctor> findByEmail(String email);
		Boolean existsByEmail(String email);
		Optional<Doctor> findByFirstName(String firstName);
		Boolean existsByFirstName(String firstName);
		List<Doctor> findBySpecialisation(String specialisation);
		

}
