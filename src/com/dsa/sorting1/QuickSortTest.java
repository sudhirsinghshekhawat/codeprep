package com.dsa.sorting1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    private QuickSort quickSort;

    @Before
    public  void setUp()
    {
        quickSort = new QuickSort();
    }

    @Test
    public  void testQuickSort()
    {
        int arr[] = {17,7,19,1,6,16};
        quickSort.sort(arr);
        assertEquals(1, arr[0]);
        assertEquals(6, arr[1]);
        assertEquals(7, arr[2]);
        assertEquals(16, arr[3]);
        assertEquals(17, arr[4]);
        assertEquals(19, arr[5]);

    }


}