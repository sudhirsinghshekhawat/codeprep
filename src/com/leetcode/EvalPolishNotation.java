package com.leetcode;

import java.util.Stack;

public class EvalPolishNotation {


    public static void main(String[] args) {
        String[] tokens = new String[]{"2","1","+","3","*"};
        System.out.println(evalNotation(tokens));
    }

    public static int evalNotation(String[] tokens) {
        int evaluatedValue = 0;
        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for (String str : tokens) {
            if (!operators.contains(str))
                stack.push(str);
            else {
                int val1 = Integer.valueOf(stack.pop());
                int val2 = Integer.valueOf(stack.pop());

                switch (str) {
                    case "+":
                        stack.push(String.valueOf(val1 + val2));
                        break;
                    case "-":
                        stack.push(String.valueOf(val1 - val2));
                        break;

                    case "*":
                        stack.push(String.valueOf(val1 * val2));
                        break;

                    case "/":
                        stack.push(String.valueOf(val1 / val2));
                        break;
                }
            }
        }

        evaluatedValue = Integer.valueOf(stack.pop());
        return evaluatedValue;
    }
}
