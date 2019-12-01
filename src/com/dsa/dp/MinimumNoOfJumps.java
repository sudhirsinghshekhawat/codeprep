package com.dsa.dp;

import java.util.Arrays;

public class MinimumNoOfJumps {


    public static void main(String[] args) {

        int arr[] = {2,1,3,2,3,4,5,1,2,8};

        System.out.println(minJumps(arr,arr.length));


    }


    public static int minJumps(int[] arr, int n) {
        int jumps[] = new int[n];


        if (n == 0 || arr[0] == 0)
            return Integer.MAX_VALUE;

        jumps[0] = 0;

        for (int i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i <= arr[j] + j) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                }
            }
        }

        return jumps[n-1];
    }


}
