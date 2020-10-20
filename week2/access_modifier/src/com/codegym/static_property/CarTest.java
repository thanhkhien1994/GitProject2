package com.codegym.static_property;

import com.codegym.static_property.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        System.out.println(Car.numberOfCars +"Xe: "+ car1.getName()+"Đời: "+ car1.getEngine());
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars +"Xe: "+ car2.getName()+"Đời: "+ car2.getEngine());
    }
}
