package com.dsa.search;

/**
 * This program is mainly used for
 * two elements sum equal to k in sorted array
 * print  the index of two elements
 */
public class TwoSumEqualsK
{

    public static void main(String[] args) {

        int arr[] = {3,6,7,11,15,17,19,21};
        twoSumEqualsToK(arr,42);




    }





    public static void  twoSumEqualsToK(int arr[],int sum)
    {

        int start_ptr = 0;
        int end_ptr = arr.length-1;

        while(start_ptr<end_ptr)
        {
            int k = arr[start_ptr]+arr[end_ptr];
            if (k==sum) {
                System.out.println("Element index is : " + start_ptr + " , " + end_ptr);
                return;
            }
            else if (k<sum)
                start_ptr++;
            else
                end_ptr--;
        }
        System.out.println("There is no element exist in array having sum equals to "+sum);
    }





}
