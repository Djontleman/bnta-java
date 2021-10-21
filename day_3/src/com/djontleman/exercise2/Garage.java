package com.djontleman.exercise2;

import java.util.Arrays;
import java.util.Objects;

public class Garage {

    private Car[] carList;
    private int capacity;
    private int count;

    public Garage(int capacity) {
        this.carList = new Car[capacity];
        this.capacity = capacity;
        this.count = 0;
    }

    public Car[] getCarList() {
        return carList;
    }

    public void setCarList(Car[] carList) {
        this.carList = carList;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carList=" + Arrays.toString(carList) +
                ", capacity=" + capacity +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return capacity == garage.capacity && count == garage.count && Arrays.equals(carList, garage.carList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, count);
        result = 31 * result + Arrays.hashCode(carList);
        return result;
    }
}
