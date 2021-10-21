package com.djontleman;

import com.djontleman.exercise1.Gender;
import com.djontleman.exercise1.Person;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	    // Exercise 1

        Person person1 = new Person(
                "Steve",
                "Dave",
                Gender.MAN,
                LocalDate.of(1980, Month.DECEMBER, 10));

        System.out.println(person1.toString());
        System.out.println((person1.getFirstName()));
        System.out.println((person1.getLastName()));
        System.out.println((person1.getGender()));
        System.out.println((person1.getDob()));
    }
}
