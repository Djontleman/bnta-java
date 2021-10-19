package com.djontleman;

public class Exercise1 {

    public static void main(String[] args) {
       /* Exercise 1
          ==========
        Write a program that reverses an array of Strings
        Given ["you", "are", "how", "Hello"]
        Print "hello how are you?" */

        String[] message = {"you", "are", "how", "Hello"};

        // Method that creates new array

        String[] reversedMessage = new String[message.length];
        for (int i = 0; i < message.length; i++) {
            reversedMessage[message.length - 1 - i] = message[i];
        }
        for (int i = 0; i < reversedMessage.length; i++) {
            System.out.print(reversedMessage[i] + " ");
        }
        System.out.println();

        // Method that prints from initial array

        for (int i = message.length - 1; i >= 0; i--) {
            System.out.print(message[i] + " ");
        }
    }
}
