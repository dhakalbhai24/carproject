package com.spring.carproject.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCar(){
        return carRepository.findAll();
    }

    public void addInventory(Car car) {
        carRepository.save(car);
    }

    public ResponseEntity<String> deleteInventory(Long id) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if(optionalCar.isPresent()){
            carRepository.deleteById(id);
            return ResponseEntity.ok("Car Deleted Successfully");
        }
        return ResponseEntity.status(404).body("Sorry, Car with id " + id + " not found.");
    }
}
