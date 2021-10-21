package com.djontleman.exercise2;

import java.util.Scanner;

public class GarageService {

    public int addCar(Garage garage, Car car) {
        if (garage.getCount() + 1 > garage.getCapacity()) {
            System.out.println("Garage is full");
            return 0;
        } else {
            garage.getCarList()[garage.getCount()] = car;
            car.setStatus(Status.REPAIRING);
            System.out.println("Car added to garage");
            garage.setCount(garage.getCount() + 1);
            return 1;
        }
    }

    public int removeCar(Garage garage, Car car) {
        for (int i = 0; i <= garage.getCarList().length; i++) {
            if (garage.getCarList()[i].equals(car)) {
                if (car.getStatus() == Status.REPAIRING) {
                    String response;
                    System.out.println("This car is still being repaired");
                    System.out.println("Are you sure you want to remove it? (yes or no)");
                    do {
                        Scanner scanner = new Scanner(System.in);
                        response = scanner.nextLine();
                        if (response.equals("no")) {
                            System.out.println("Confirmation: Car was not removed as is still being repaired");
                            return 1;
                        } else if (response.equals("yes")){
                            System.out.println("Confirmation: Removing car from garage");
                        } else {
                            System.out.println("Invalid response: Please type yes or no");
                        }
                    } while (!response.equals("yes"));
                }
                garage.getCarList()[i] = null;
                garage.setCount(0);
                Car[] updatedCarList = new Car[garage.getCapacity()];
                for (Car carInGarage : garage.getCarList()) {
                    if (carInGarage != null) {
                        updatedCarList[garage.getCount()] = carInGarage;
                        garage.setCount(garage.getCount() + 1);
                    }
                }
                garage.setCarList(updatedCarList);
                System.out.println("Car was removed from garage");
                return 1;
            }
        }
        return 0;
    }
}


