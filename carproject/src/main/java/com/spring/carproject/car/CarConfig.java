package com.spring.carproject.car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarRepository repository){
        return args -> {
            Car blueCar = new Car("Toyota", "Corolla", "XLE", "2023", "Blue", 23000);
            Car redCar = new Car("Tesla", "Model3", "Long Range", "2024", "Red", 55000);

            repository.saveAll(List.of(blueCar, redCar));
        };

    }
}
