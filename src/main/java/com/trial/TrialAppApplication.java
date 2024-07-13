package com.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrialAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrialAppApplication.class, args);
		System.out.println("trail app is running on azure");
	}

}
