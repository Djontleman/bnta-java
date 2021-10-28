package com.djontleman.testing.exercise;

import java.util.List;
import java.util.stream.Collectors;

public class ExerciseMain {

    /* - Create gender enum
       - Create a class Person with Name and Gender
       - Take the following imperative code and turn into declarative using Streams.

        List<Person> people = List.of(
                new Person("Smith", Gender.FEMALE),
                new Person("Anna", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Oliver", Gender.MALE)
        );

        List<Person> female = new ArrayList<>();

        people.forEach(person -> {
            var isGender = person.gender.equals(Gender.FEMALE);
            if (isGender) {
                female.add(person);
            }
        });

        female.forEach(System.out::println); */

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Smith", Gender.FEMALE),
                new Person("Anna", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Oliver", Gender.MALE)

        );

        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
//                .map(person -> person.getName())   // to get only names, changed List<Person> to List<String>
                .collect(Collectors.toList());

        females.forEach(System.out::println);
    }

}
