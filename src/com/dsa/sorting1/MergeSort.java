package com.dsa.sorting1;

import java.util.Arrays;

public class MergeSort {

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        System.out.println(Arrays.toString(arr));

    }

    private void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l+i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + j + 1];


        int k = l;
        int i =0;
        int j=0;

        while (i<n1 && j < n2)
        {
            if (L[i]<=R[j])
            {
                arr[k]=L[i];
                i++;

            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }


        while (i<n1)
        {
            arr[k]=L[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            arr[k]=R[j];
            j++;
            k++;
        }
    }

}
