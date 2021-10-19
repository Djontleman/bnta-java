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

        // Setup
        if (array2.length < 1) {
            String[] longestStringArray = new String[1];
            System.out.println("");
        } else {
            String[] longestStringArray = new String[array2.length];

            longestStringArray[0] = "";

            // Find longest string(s) and put them into array
            int i = 0;
            for (String element : array2) {
                if (element.length() > longestStringArray[i].length()) {
                    i = 0;
                    longestStringArray[i] = element;
                } else if (element.length() == longestStringArray[i].length()) {
                    i++;
                    longestStringArray[i] = element;
                }
            }

            // Remove duplicates
            for (int j = 0; j < longestStringArray.length; j++) {
                for (int k = 0; k < longestStringArray.length; k++) {
                    if (j == k || longestStringArray[j] == null || longestStringArray[k] == null) {
                        continue;
                    }
                    if (longestStringArray[j].equals(longestStringArray[k])) {
                        longestStringArray[k] = null;
                    }
                }
            }

            // Print longest string(s)
            for (String element : longestStringArray) {
                if (element == null) {
                    continue;
                }
                System.out.print(element + " ");
            }
        }
    }
}
