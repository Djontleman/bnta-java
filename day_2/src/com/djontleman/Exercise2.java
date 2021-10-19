package com.djontleman;

import java.math.BigDecimal;

public class Exercise2 {

    public static void main(String[] args) {
        /* Exercise 2
           ==========
        Write a program that adds total amount for
        this string "0.90, 1.00, 9.00, 8.78, 0.01"
        and either print a decimal or BigDecimal */

        // Convert single string to array of strings
        String prices = new String("0.90, 1.00, 9.00, 8.78, 0.01");
        String[] pricesStringsArray = prices.split(", ");
        for (String priceString: pricesStringsArray) {
            System.out.print(priceString + " ");
        }
        System.out.println();

        // Convert array of strings to array of doubles
        BigDecimal[] pricesArray = new BigDecimal[pricesStringsArray.length];
        for (int i = 0; i < pricesArray.length; i++) {
            pricesArray[i] = new BigDecimal(pricesStringsArray[i]);
        }
        for (BigDecimal price: pricesArray) {
            System.out.print(price + " ");
        }
        System.out.println();

        // Add the array elements and print the sum
        BigDecimal sum = new BigDecimal("0.00");
        for (BigDecimal price: pricesArray) {
            sum = sum.add(price);
        }
        System.out.print("The total amount is " + sum);
    }
}
