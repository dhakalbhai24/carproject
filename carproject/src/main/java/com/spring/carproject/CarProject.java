package com.spring.carproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class CarProject {

	public static void main(String[] args) {
		SpringApplication.run(CarProject.class, args);
	}
	@GetMapping
	public List<String> showMessage(){
		return List.of("Red Car", "Blue Car", "Pink Car", "Yellow Car", "Maroon Car");
	}

}
