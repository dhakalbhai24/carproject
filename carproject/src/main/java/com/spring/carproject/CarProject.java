package com.spring.carproject;

import com.spring.carproject.car.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class CarProject {

	public static void main(String[] args) {
		SpringApplication.run(CarProject.class, args);
	}
}
