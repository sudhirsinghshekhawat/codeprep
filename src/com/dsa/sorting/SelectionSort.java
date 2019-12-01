package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int arr[] = {6, 3, 1, 7, 5};
        System.out.println("Before Sorring : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }


    public static void selectionSort(int[] arr) {


        for (int i=0;i<arr.length;i++)
        {
            int min = i;

            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[j]<arr[min])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }



    }


}
