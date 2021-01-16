package com.eniso.pm.configserver;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication extends SpringBootServletInitializer {
	DataSource dataSource ;

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConfigserverApplication.class);

	} 
//	@Bean
//	public DataSource dataSource() 
//	{
//	  JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
//	  DataSource dataSource = dataSourceLookup.getDataSource("java:jboss/datasources/test");
//	  return dataSource;
//	}
//	
}

