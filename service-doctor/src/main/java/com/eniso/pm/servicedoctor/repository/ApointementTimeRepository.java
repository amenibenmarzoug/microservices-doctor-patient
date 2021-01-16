package com.eniso.pm.servicedoctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eniso.pm.servicedoctor.entities.AppointementTime;


public interface ApointementTimeRepository extends JpaRepository<AppointementTime, Long>{

}
