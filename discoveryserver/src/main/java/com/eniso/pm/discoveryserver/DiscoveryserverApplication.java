package com.eniso.pm.discoveryserver;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableEurekaServer


public class DiscoveryserverApplication  extends SpringBootServletInitializer {




	public static void main(String[] args) {
		SpringApplication.run(DiscoveryserverApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DiscoveryserverApplication.class);
	}

}
