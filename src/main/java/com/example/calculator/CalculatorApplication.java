package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		//System.setProperty("spring.config.name", "eureka-server");
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
