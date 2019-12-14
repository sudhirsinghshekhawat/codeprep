package com.dsa.sorting1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    private  BubbleSort bubbleSort;

    @Before
    public void setUp()
    {
        bubbleSort = new BubbleSort();
    }


    @Test
    public void sortTest()
    {
        int arr[] = {17,7,19,1,6,16};
        bubbleSort.sort(arr);
        assertEquals(1, arr[0]);
        assertEquals(6, arr[1]);
        assertEquals(7, arr[2]);
        assertEquals(16, arr[3]);
        assertEquals(17, arr[4]);
        assertEquals(19, arr[5]);
    }


    @Test
    public void swapTest()
    {
        int arr[] = {17,7,19,1,6,16};
        bubbleSort.swap(arr, 0, 1);
        assertEquals(7, arr[0]);
        assertEquals(17, arr[1]);


    }



}