package com.djontleman.exercise1;

import java.util.HashMap;
import java.util.Map;

public class Exercise1Main {

    public static void main(String[] args) {

        String testString1 = "a,b,b,c,c,c,z";
        String testString2 = "";
        letterOccurrences(testString1);
    }

    public static void letterOccurrences(String string) {

        if (string.length() == 0) {
            System.out.println("String empty");
            return;
        }

        String[] arrayOfLetters = string.split(",");
        Map<String, Integer> map = new HashMap<>();
        for (String letter : arrayOfLetters) {
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                map.put(letter, map.get(letter) + 1);
            }
        }
        for (String letter : map.keySet()){
            System.out.println(letter + ": " + map.get(letter));
        }
//        System.out.println(map);
    }
}
