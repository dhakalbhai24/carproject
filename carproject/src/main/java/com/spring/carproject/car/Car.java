package com.spring.carproject.car;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name = "carInventory")
public class Car {
    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            initialValue = 9000,
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "car_sequence"
    )
    @Column(name = "id")
    private Long id;
    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Column(name = "trim")
    private String trim;
    @Column(name = "year")
    private String year;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private double price;
    @Column(name = "mileage")
    private String mileage;
    @Column(name = "car_type")
    private String carType;
    @Column(name = "transmission")
    private String transmission;
    @Column(name = "picture_url")
    private String pictureUrl;

    public Car() {
    }

    public Car(Long id, String make, String model, String trim, String year, String color, double price, String mileage, String carType, String transmission, String pictureUrl) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.year = year;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.carType = carType;
        this.transmission = transmission;
        this.pictureUrl = pictureUrl;
    }

    public Car(String make, String model, String trim, String year, String color, double price, String mileage, String carType, String transmission, String pictureUrl) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.year = year;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.carType = carType;
        this.transmission = transmission;
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", trim='" + trim + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mileage='" + mileage + '\'' +
                ", carType='" + carType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}

