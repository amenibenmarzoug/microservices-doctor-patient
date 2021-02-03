package com.eniso.pm.servicepatient.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eniso.pm.servicepatient.entity.DossierMedical;



@Repository
public interface DossierMedicalRepository extends JpaRepository<DossierMedical, Long> {


}