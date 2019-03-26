package com.barber.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ServletComponentScan
@Configuration
public class BusinessApplication {
	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
	}
}
