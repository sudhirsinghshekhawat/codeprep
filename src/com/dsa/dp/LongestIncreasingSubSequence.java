package com.dsa.dp;

public class LongestIncreasingSubSequence
{

    public static void main(String[] args) {
        int arr[] = {3,4,-1,0,6,2,3};
        longestIncreasingSubSeq(arr);

    }




    public static void longestIncreasingSubSeq(int arr[])
    {
        int T[] = new int[arr.length];
        int[] arr1 = new int[arr.length];

        for (int i=0;i<arr.length;i++)
        {
            T[i]=1;
            arr1[i] = i;
        }

        for(int i =1;i<arr.length;i++)
        {
            for (int j=0;j<i;j++)
            {
                if (arr[i]>arr[j])
                {

                    T[i] = Math.max(T[i],T[j]+1);
                    arr[i] = j;
                }
            }
        }


        int maxIndex  = 0;
        for (int i=0;i<T.length;i++)
        {
            if (T[i]>T[maxIndex])
                maxIndex = i;
        }

        System.out.println("maximum length = "+T[maxIndex]);

        int t;

        int newT = maxIndex;

        do {
            t = newT;
            System.out.print(arr[t]+" ");
            newT = arr1[t];
        }while (t!=newT);

    }










}
