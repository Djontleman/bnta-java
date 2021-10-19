package com.djontleman;

public class Exercise4 {

    public static void main(String[] args) {
        /* Exercise 4
           ==========
        Write a program that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo */

        String[] array1 = {};
        String[] array2 = {"hello", "ola", "bye", "ciao"};
        String[] array3 = {"hello", "hello", "ola", "bye", "ciao"};
        String[] array4 = {"hello", "bingo", "ola", "bye", "ciao"};

        // array1 last

        // for array2

        String[] longestStringArray = new String[array2.length];
        longestStringArray[0] = "";
        // attempt 1
//        for (int i = 0; i > array2.length; i++) {
//            if (array2[i].length() > longestStringArray[i].length()) {
//                longestStringArray[i] = array2[i];
//            }
//        }

        // attempt 2
        int i = 0;
        for (String element: array2) {
            if (element.length() > longestStringArray[i].length()) {
                longestStringArray[i] = element;
            }
        }

        for (String element: longestStringArray) {
            if (element == null) {
                continue;
            }
            System.out.print(element + " ");
        }
    }
}
