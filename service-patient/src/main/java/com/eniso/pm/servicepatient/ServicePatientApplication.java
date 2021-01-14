package com.eniso.pm.servicepatient;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class ServicePatientApplication extends SpringBootServletInitializer {
	DataSource dataSource ;


	public static void main(String[] args) {
		SpringApplication.run(ServicePatientApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServicePatientApplication.class);
	}
	

}
