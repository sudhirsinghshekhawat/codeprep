package com.dsa.search;

import java.util.Arrays;
import java.util.HashSet;

public class findTriplestWithSumK {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        findTriplets(arr, 24);
        System.out.println("------------------------");
        findTripletsUsingSets(arr,24);

    }


    //using sets
    public static void findTripletsUsingSets(int arr[],int k)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        boolean found = false;

        for (int i=0;i<arr.length-1;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                int x = k-(arr[i]+arr[j]);
                if (hashSet.contains(x))
                {
                    found = true;
                    System.out.println("Values are : "+x+" "+arr[i]+" "+arr[j]);
                }
                else
                {
                    hashSet.add(arr[j]);
                }
            }
        }

        if (found==false)
            System.out.println("Triplets doesn't found");

    }






    //using sorted way
    public static void findTriplets(int[] arr, int k) {

        Arrays.sort(arr);
        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {

            int x = arr[i];
            int l = i + 1;
            int j = arr.length - 1;

            while (l < j) {
                if (x + arr[l] + arr[j] == k) {
                    System.out.println("values are : " + x + " " + arr[l] + " " + arr[j]);
                    l++;
                    j--;
                    found = true;
                } else if (x + arr[l] + arr[j] < k)
                    l++;
                else
                    j--;
            }

        }
        if (found == false) {
            System.out.println("Triplets sum doesn't exist");
        }


    }


}
