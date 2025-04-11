package com.springboot.TRA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class TouristRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristRegistrationApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigure() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/tourist/addtourist")
				.allowedOrigins("http://localhost:4200");
				registry
				.addMapping("Tourist/gettourist")
				.allowedOrigins("http://localhost:4200");
			}
		};
		
	}
	
	
}