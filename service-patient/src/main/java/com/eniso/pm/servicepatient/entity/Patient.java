package com.eniso.pm.servicepatient.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Table(name = "patient")
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Patient implements Serializable {
	@Id 
	@GeneratedValue 
	private Long id ; 
	private String firstName ; 
	private String lastName ; 
	private String address ;


}