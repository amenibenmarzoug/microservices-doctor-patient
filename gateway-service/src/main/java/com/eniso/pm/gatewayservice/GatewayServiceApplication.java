package com.eniso.pm.gatewayservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;


@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	@Bean
	public ServerCodecConfigurer serverCodecConfigurer() {
	   return ServerCodecConfigurer.create();
	}
//	@Bean
//	DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp) {
//		//system de routage dynamique!!
//		return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
//	}
	//scalabilité horizontale ici!!
	//configuration statique de routes!!
//	@Bean
//	RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(r->r.path("/doctors/**").uri("lb://service-doctor").id("r1"))
//				.route(r->r.path("/patients/**").uri("lb://service-patient").id("r2"))
//				.build();
//		
//	}

}
