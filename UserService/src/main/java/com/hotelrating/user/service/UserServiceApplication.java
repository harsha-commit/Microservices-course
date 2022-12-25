package com.hotelrating.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	// CREATING USER MICROSERVICE
	// 1. configure database in application.yml
	// 2. Setup Entity, Repository, Controller, Service  packages

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
