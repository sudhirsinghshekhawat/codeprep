package com.dsa.search;

public class BinarySearch {


    public static void main(String[] args) {


        int arr[] = {3, 7, 8, 11, 13, 16, 18, 21};
        //Iterative call
        System.out.println(binarySearch(arr, 21));
        System.out.println(binarySearch(arr, 31));

        //Recursive call
        System.out.println(binarySearchRecursive(arr, 0, 7, 11));
        System.out.println(binarySearchRecursive(arr, 0, 7, 31));


    }


    public static boolean binarySearchRecursive(int[] arr, int low, int high, int data) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == data)
                return true;
            else if (arr[mid] < data)
                return binarySearchRecursive(arr, mid + 1, high, data);

            return binarySearchRecursive(arr, low, mid - 1, data);
        } else
            return false;

    }


    public static boolean binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == num)
                return true;
            if (arr[mid] < num)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }


}
