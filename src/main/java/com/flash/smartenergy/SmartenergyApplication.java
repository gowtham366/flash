package com.flash.smartenergy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SmartenergyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartenergyApplication.class, args);
	}

}
