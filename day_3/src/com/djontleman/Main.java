package com.djontleman;

// Exercise 1 Imports
import com.djontleman.exercise1.Gender;
import com.djontleman.exercise1.Person;

// Exercise 2 Imports
import com.djontleman.exercise2.Car;
import com.djontleman.exercise2.Garage;
import com.djontleman.exercise2.GarageService;
import com.djontleman.exercise2.Status;

// Exercise 3 Imports
import com.djontleman.exercise3.email.EmailValidator;

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

//        Car car1 = new Car("ford", "focus", "1999", Status.BROKEN);
//        Car car2 = new Car("vauxhall", "astra", "2003", Status.BROKEN);
//        Car car3 = new Car("citroen", "picasso", "2005", Status.BROKEN);
//        Car car4 = new Car("mercedes", "c-class", "2010", Status.BROKEN);
//
//
//        Garage garage = new Garage(25);
//
//        GarageService garageService = new GarageService();
//
//        garageService.listCars(garage);
//
//        garageService.addCar(garage, car1);
//        garageService.addCar(garage, car2);
//
//        garageService.carFixed(garage, car2);
//        garageService.carFixed(garage, car3);
//        garageService.listCars(garage);
//
//        garageService.removeCar(garage, car2);
//        garageService.listCars(garage);


        // Exercise 3

        String email1 = "random@gmail.co.uk";
        String email2 = "random.gmail@com";
        String email3 = "random";
        String email4 = "random@gmail";
        String email5 = "random.email";
        String email6 = "random@gmail@.com";
        String email7 = "@random.com";
        String email8 = "random@gmail.";
        String email9 = "random@.gmail";
        String email10= "random@gmail..com";

        EmailValidator emailValidator = new EmailValidator();
        System.out.println(emailValidator.runLoops(email10));
    }
}
