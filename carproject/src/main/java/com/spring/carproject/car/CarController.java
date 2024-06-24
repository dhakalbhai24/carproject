package com.spring.carproject.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "app/v1")
public class CarController {

    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCar(){
        return carService.getCar();
    }

    @PostMapping
    public void addNewInventory(@RequestBody Car car){
        carService.addInventory(car);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteInventory(@PathVariable Long id){
        return carService.deleteInventory(id);
    }

}
