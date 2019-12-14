package com.dsa.sorting1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    private MergeSort mergeSort;

    @Before
    public void setup()
    {
        mergeSort = new MergeSort();
    }

    @Test
    public void mergeSortTest()
    {
        int arr[] = {17,7,19,1,6,16};
        int left = 0;
        int right = arr.length-1;
        mergeSort.sort(arr,left, right);
        assertEquals(1, arr[0]);
        assertEquals(6, arr[1]);
        assertEquals(7, arr[2]);
        assertEquals(16, arr[3]);
        assertEquals(17, arr[4]);
        assertEquals(19, arr[5]);

    }


}