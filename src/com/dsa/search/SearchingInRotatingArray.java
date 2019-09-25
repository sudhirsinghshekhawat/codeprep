package com.dsa.search;

public class SearchingInRotatingArray
{
    public static void main(String[] args) {


        int arr[] = {15,16,17,18,19,1,2,3,4,5};
        int index = searchInRotatingArray(arr,1,0,arr.length);
        System.out.println(index);
    }





  public static int searchInRotatingArray(int[] arr,int data,int low,int high)
  {
      int mid = low+(high-low)/2;

    if (data==arr[mid])
        return mid;
    else  if (arr[low]<arr[mid])
    {
        if (data >=arr[low] && data<arr[mid])
            return searchInRotatingArray(arr,data,low,mid-1);
        else
            return searchInRotatingArray(arr,data,mid+1,high);
    }
    else
    {
        if (data>arr[mid] && data<=arr[high])
            return searchInRotatingArray(arr,data,mid+1,high);
        else
            return searchInRotatingArray(arr,data,low,mid-1);


    }












  }



}
