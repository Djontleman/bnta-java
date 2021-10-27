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
        String testString6 = "";

        System.out.println(bracketChecker(testString6));
    }

    public static boolean bracketChecker(String string) {

        Stack<String> stack = new Stack<>();

        String[] stringList = string.split("");

        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i].equals("(") ||
                    stringList[i].equals("{") ||
                    stringList[i].equals("[")) {
                stack.add(stringList[i]);
            } else if (stringList[i].equals(")") ||
                    stringList[i].equals("}") ||
                    stringList[i].equals("]")) {
                String test = stack.peek() + stringList[i];
                if (test.equals("()") || test.equals("{}") || test.equals("[]")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (stack.size() == 1 && i == stringList.length - 1) {
                return false;
            }
//            System.out.println(stack);
        }
        return true;
    }
}
