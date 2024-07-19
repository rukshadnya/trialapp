package com.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TrialAppApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Team.. we are successfully deployed on Azure Cloud.. ";
	}
	public static void main(String[] args) {
		SpringApplication.run(TrialAppApplication.class, args);
		
	}

}
