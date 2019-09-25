package com.dsa.search;

public class FirstOccuranceOfDuplicate
{


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,5,9};
        int index = firstOccuranceOfDuplicate(arr,5,0,arr.length-1);
        System.out.println("index = "+index);



    }









    public static int firstOccuranceOfDuplicate(int[] arr,int data,int left,int right)
    {
        int mid = left+(right-left)/2;

        if ( (left==mid && arr[mid]==data) ||(arr[mid]==data&&arr[mid-1]<data))
            return  mid;
        else if (arr[mid]>data)
            return firstOccuranceOfDuplicate(arr,data,left,mid-1);
        else
            return firstOccuranceOfDuplicate(arr,data,mid+1,right);
    }
}
