package com.leetcode;

import java.util.Arrays;

public class RotateArray
{

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        rotate1(arr,2);

         arr = new int[]{1, 2, 3, 4, 5, 6};
        rotate2(arr,2);

        arr = new int[]{1, 2, 3, 4, 5, 6};
        rotate3(arr,2);


    }


    public static void rotate1(int arr[],int k)
    {
        if (k>arr.length)
            k = k%arr.length;

        int rotatedArray[] = new int[arr.length];

        System.out.println("suhirls");

        for (int i=0;i<k;i++)
        {
            rotatedArray[i] = arr[arr.length-k+i];
        }

        int j=0;

        for(int i=k;i<arr.length;i++)
        {
            rotatedArray[i]= arr[j];
            j++;
        }

        System.arraycopy(rotatedArray,0,arr,0,arr.length);

        System.out.println(Arrays.toString(arr));
    }


    public  static  void rotate2(int arr[],int k)
    {
        if (arr==null||k<0)
            throw new IllegalArgumentException("Illegal Argument");

        for (int i =0;i<k;i++)
        {
            for (int j = arr.length-1;j>0;j--)
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate3(int arr[],int k)
    {

        int a = arr.length-k;

        reverse(arr,0,a-1);
        reverse(arr,a,arr.length-1);
        reverse(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));


    }


    public static void reverse(int arr[],int left,int right)
    {
        if (arr==null||arr.length==1)
            return;

        while(left<right)
        {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }





}
