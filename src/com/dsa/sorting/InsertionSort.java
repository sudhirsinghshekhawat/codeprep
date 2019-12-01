package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args) {


        int arr[] = {6, 3, 1, 7, 5};
        System.out.println("Before Sorring : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }






    public static void insertionSort(int[] arr) {

        for (int i = 1; i <= arr.length-1; i++) {
            int v = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > v ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = v;

        }
    }
}
