package com.eniso.pm.servicedoctor;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ServiceDoctorApplication extends SpringBootServletInitializer{
	DataSource dataSource ;
	public static void main(String[] args) {
		SpringApplication.run(ServiceDoctorApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServiceDoctorApplication.class);
	}

}
