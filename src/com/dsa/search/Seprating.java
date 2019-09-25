package com.dsa.search;

import java.util.Arrays;

public class Seprating
{


    public static void main(String[] args)
    {
        int arr[] = {0,1,0,1,1,0,1,1,1,0,1,0};

        System.out.println("Before Separting 0 and 1: "+Arrays.toString(arr));
        seprate0s1s(arr);
        System.out.println("After Separating 0 and 1 "+Arrays.toString(arr));

        int arr1[] = {0,1,2,0,1,0,1,0,1,0,1,2,1,2,0};
        System.out.println("Before Separating 0,1,2 : "+Arrays.toString(arr1));
        separate012(arr1);
        System.out.println("After Separating 0,1,2, : "+Arrays.toString(arr1));






    }




    public static void separate012(int[] arr)
    {
        int high = arr.length-1;
        int low = 0;
        int mid = 0;

        while (mid<=high)
        {
            switch (arr[mid])
            {
                case 0:
                    swap(arr,low,mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }





    public static void seprate0s1s(int arr[]) {
        int r = arr.length - 1;
        int l = 0;

        while (l <= r) {
            while (arr[l] == 0)
                l++;
            while (arr[r] == 1)
                r--;
            if (l < r) {
                arr[l] = 0;
                arr[r] = 1;
                l++;
                r--;
            }
        }
    }










}
