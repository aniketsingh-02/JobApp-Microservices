package com.embarkx.companyms;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompanymsApplication {

	public static void main(String[] args) {
		// Set JVM default timezone before Spring Boot initialization
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));

		SpringApplication.run(CompanymsApplication.class, args);
	}
}
