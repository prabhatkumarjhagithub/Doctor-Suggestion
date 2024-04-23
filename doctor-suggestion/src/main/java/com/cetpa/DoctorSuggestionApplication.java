package com.cetpa;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
//@EnableTransactionManagment
@EnableTransactionManagement
public class DoctorSuggestionApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DoctorSuggestionApplication.class, args);
		
	}

}
