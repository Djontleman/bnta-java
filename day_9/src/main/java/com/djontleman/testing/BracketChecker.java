package com.djontleman.testing;

import java.util.Stack;

public class BracketChecker {

//    public static void main(String[] args) {
//        String testString1 = "({()})";
//        String testString2 = "({})";
//        String testString3 = "()";
//        String testString4 = "({( })";
//        String testString5 = "({()}";
//        String testString6 = "";
//
//        System.out.println(bracketChecker(testString6));
//    }

    public boolean bracketChecker(String string) {

        Stack<String> stack = new Stack<>();

        String[] stringList = string.split("");

        for (String element : stringList) {

//            if (element.equals("(") ||
//                    element.equals("{") ||
//                    element.equals("[")) {
//                stack.add(element);
//            } else if (element.equals(")") ||
//                    element.equals("}") ||
//                    element.equals("]")) {
//                String test = stack.peek() + element;
//                if (test.equals("()") || test.equals("{}") || test.equals("[]")) {
//                    stack.pop();
//                } else {
//                    return false;
//                }
//            }

            switch (element) {
                case "(", "{", "[":
                    stack.push(element);
                    break;
                case ")":
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        return false;
                    } break;
                case "}":
                    if (stack.peek().equals("{")) {
                        stack.pop();
                    } else {
                        return false;
                    } break;
                case "]":
                    if (stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        return false;
                    } break;
            }
//            System.out.println(stack);
        }
        return stack.empty();
    }
}
