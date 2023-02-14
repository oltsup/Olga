package com.home.service;

import com.home.Car;
import tms.exception.EvenNumberException;

public class MainCar {
    public static void main(String[] args) {
        Car[] cars = new Car[2];

        cars[0] = new Car("Porsche",250,281000);
        cars[1] = new Car("Hummer",180,533000);

        for (Car car:cars) {
            try {
                car.start();
            } catch (EvenNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}