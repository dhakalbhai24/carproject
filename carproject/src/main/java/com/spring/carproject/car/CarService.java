package com.spring.carproject.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public void addNewCar(Car car) {
        carRepository.save(car);
    }
}
