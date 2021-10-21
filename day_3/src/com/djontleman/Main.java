package com.djontleman;

// Exercise 1 Imports
import com.djontleman.exercise1.Gender;
import com.djontleman.exercise1.Person;

// Exercise 2 Imports
import com.djontleman.exercise2.Car;
import com.djontleman.exercise2.Garage;
import com.djontleman.exercise2.GarageService;
import com.djontleman.exercise2.Status;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	    // Exercise 1

//        Person person1 = new Person(
//                "Steve",
//                "Dave",
//                Gender.MAN,
//                LocalDate.of(1980, Month.DECEMBER, 10));
//
//        System.out.println(person1.toString());
//        System.out.println((person1.getFirstName()));
//        System.out.println((person1.getLastName()));
//        System.out.println((person1.getGender()));
//        System.out.println((person1.getDob()));


        // Exercise 2

        Car car1 = new Car("ford", "focus", "1999", Status.BROKEN);
        Car car2 = new Car("vauxhall", "astra", "2003", Status.BROKEN);
        Car car3 = new Car("citroen", "picasso", "2005", Status.BROKEN);
        Car car4 = new Car("mercedes", "c-class", "2010", Status.BROKEN);
//        System.out.println(car1.getStatus());
//        System.out.println(car2.toString());

        Garage garage = new Garage(25);
        System.out.println(garage.toString());

        GarageService garageService = new GarageService();

        garageService.addCar(garage, car1);
        System.out.println(garage.toString());

        garageService.addCar(garage, car2);
        System.out.println(garage.toString());

        garageService.removeCar(garage, car1);
        System.out.println(garage.toString());


    }
}
