package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {6, 3, 1, 7, 5};
        System.out.println("Before Sorring : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));

        System.out.println("----------------------------");


        arr = new int[]{6, 3, 1, 7, 5, 4};
        System.out.println("Before Sorring : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));


        arr = new int[]{1,2,3,4,5,6,7};
        System.out.println("Before Sorring : " + Arrays.toString(arr));
        bubbleSortImprovedVersion(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));

    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortImprovedVersion(int[] arr) {
        int swapped = 1;
        for (int i = 0; i < arr.length && swapped == 1; i++) {
            swapped = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = 1;
                }
            }
        }

    }

}
