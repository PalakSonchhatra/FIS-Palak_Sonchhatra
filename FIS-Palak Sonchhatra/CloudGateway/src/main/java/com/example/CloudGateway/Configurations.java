package com.example.CloudGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {
	
	@Bean
	public RouteLocator getRoutesLocator(RouteLocatorBuilder rout) {
		return rout.routes()
				.route(p->p.path("/admin/**").uri("lb://adminservice/admin"))
				.route(p->p.path("/ts/**").uri("lb://customerservice/ts"))
				.build();
	}

}
