package com.shivam.firstApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfigFile {

	@Bean
	Car getCar() {
		return new Lamborghini();
	}
	
	@Bean
	Tyre getTyre() {
		return new Tyre();
	}
	
}
