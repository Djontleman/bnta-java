package com.djontleman;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        /* Exercise 3
           ==========
        Write a program that takes an input from the user.
        Either yes or no.
        If yes it displays a random joke and asks the same question.
        If no exit the program. */

        boolean running = true;
        while (running == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Would you like to hear a corny joke? ");

            String response = scanner.nextLine();

            switch(response.toLowerCase(Locale.ROOT)) {
                case "yes":
                    // TODO: Add delay to punchline
                    // TODO: Connect to random joke API
                    System.out.println("Insert setup here");
                    System.out.println();
                    System.out.println("Punchline");
                    System.out.println();
                    break;
                case "no":
                    System.out.println("Okay... :(");
                    running = false;
                    break;
                default:
                    System.out.println("yes or no pls");
                    System.out.println();
            }
        }
    }
}
