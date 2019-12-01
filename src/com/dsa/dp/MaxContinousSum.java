package com.dsa.dp;

public class MaxContinousSum {


    public static void main(String[] args) {
        int arr[] = {-2, 11, -4, 13, -5, 2};
        int sum = maxContinousSum1(arr);
        System.out.println("maxSum1 = " + sum);
        sum = maxContinousSum2(arr);
        System.out.println("maxSum2 = "+sum);
        sum = maxContinousSum3(arr);
        System.out.println("maxSum3 DP : "+sum);


    }



    //maxSum3 using DP O(n)
    public  static int maxContinousSum3(int[] arr)
    {
        int maxSum = arr[0],sum = 0;

        for (int i=0;i<arr.length;i++)
        {
            sum = Math.max(sum+arr[i],arr[i]);
            maxSum = Math.  max(maxSum,sum);
        }
        return  maxSum;
    }



    //maxSum2 O(n*n)
    public static int maxContinousSum2(int[] arr) {

        int maxSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            int currSum = 0;
            for (int j=i;j<arr.length;j++)
            {
                currSum+=arr[j];
                if (currSum>maxSum)
                    maxSum = currSum;
            }
        }
        return  maxSum;
    }


    //maxSum1 O(n*n*n)
    public static int maxContinousSum1(int[] arr) {
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (currSum > maxSum)
                    maxSum = currSum;
            }
        }
        return maxSum;
    }


}
