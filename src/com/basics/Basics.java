package com.basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Basics {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(3);
        Iterator<Integer> it = treeSet.descendingIterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext())
        {
            sb.append(it.next());
        }
        System.out.println(sb);
        Integer.parseInt(sb.toString());

        Integer.toString(123).length();

       int[] arr = new int[5];
        Arrays.sort(arr);
    }
}
