package com.dsa.sorting;

import java.util.Arrays;

public class CountingSort
{

    public static void main(String[] args) {


        CountingSort countingSort = new CountingSort();
        char[] arr = {'s','u','d','h','i','r'};
        countingSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }




    void sort(char[] arr)
    {
        int n = arr.length;
        char output[] = new char[n];

        int count[] = new int[256];


        for (int i=0;i<256;i++)
        {
            count[i]=0;
        }

        for(int i =0;i<n;i++)
        {
            ++count[arr[i]];
        }


        for (int i=1;i<256;i++)
        {
            count[i]+=count[i-1];
        }

        for (int i=n-1;i>=0;i--)
        {
            output[count[arr[i]]-1]=arr[i];
            --count[arr[i]];
        }

        for (int i=0;i<n;i++)
        {
            arr[i]=output[i];
        }
    }



}
