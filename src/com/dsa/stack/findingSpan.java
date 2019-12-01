package com.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class findingSpan {


    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findingSpans(arr)));
        System.out.println(Arrays.toString(findSpansUsingStack(arr)));

    }


    private static int[] findSpansUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] spans = new int[arr.length];
        stack.push(0);
        spans[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i])
                stack.pop();
            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        return spans;


    }


    private static int[] findingSpans(int[] arr) {

        int[] spans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int span = 1;

            int j = i - 1;
            while (j >= 0 && arr[j] < arr[i]) {
                span++;
                j--;
            }
            spans[i] = span;
        }
        return spans;

    }


}
