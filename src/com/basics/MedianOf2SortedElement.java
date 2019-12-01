package com.basics;

public class MedianOf2SortedElement {

    static int[] a = new int[]{900};
    static int[] b = new int[]{10, 13, 14};


    public static void main(String args[])
    {
        int n = a.length;
        int m = b.length;


        if (n < m)
            System.out.print("The median is : " +
                    findMedianSortedArrays(n, m));
        else
            System.out.print("The median is : " +
                    findMedianSortedArrays(m, n));
    }


    static double findMedianSortedArrays(int n, int m) {
        int minIndex = 0;
        int maxIndex = n;
        int i = 0;
        int j = 0;
        int median = 0;


        while (minIndex <= maxIndex) {
            i = (minIndex + maxIndex) / 2;
            j = (m + n + 1) / 2 - i;


            if (i < n && j > 0 && b[j - 1] > a[i])
                minIndex = i + 1;

            else if (i > 0 && j < m && b[j] < a[i - 1])
                maxIndex = i - 1;

            else {
                if (i == 0)
                    median = b[j - 1];
                else if (j == 0)
                    median = a[i - 1];
                else
                    median = Math.max(a[i - 1], b[j - 1]);
                break;
            }
        }

        if ((m + n) % 2 == 0)
            return (double) median;
        if (i == n)
            return (median + b[j]) / 2.0;

        if (j == m)
            return (median + a[i]) / 2.0;

        return (median + Math.min(a[i], b[j])) / 2.0;
    }


}
