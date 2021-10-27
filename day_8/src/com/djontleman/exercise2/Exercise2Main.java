package com.djontleman.exercise2;

import java.util.List;
import java.util.Stack;

public class Exercise2Main {

    public static void main(String[] args) {
        String testString1 = "({()})";
        String testString2 = "({})";
        String testString3 = "()";
        String testString4 = "({( })";
        String testString5 = "({()}";

        System.out.println(bracketChecker(testString5));
    }

    public static boolean bracketChecker(String string) {

        Stack<String> stack = new Stack<>();

        String[] stringList = string.split("");

        for (String element : stringList) {
            if (element.equals("(") ||
                    element.equals("{") ||
                    element.equals("[")) {
                stack.add(element);
            } else if (element.equals(")") ||
                    element.equals("}") ||
                    element.equals("]")) {
                String test = stack.peek() + element;
                if (test.equals("()") || test.equals("{}") || test.equals("[]")) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                if (stack) {
                    return false;
                }
            }
        }
        return true;
    }
}
