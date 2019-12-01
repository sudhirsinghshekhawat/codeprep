package com.dsa.dp;

public class CutRod
{


    public static void main(String[] args) {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println("Maximum value is : "+cutRod(arr,arr.length));
        System.out.println("Maximum value is (by DP): "+cutRodDynamic(arr,arr.length));

    }




    public static int cutRodDynamic(int price[],int n)
    {
        int val[] = new int[n+1];
        val[0]=0;

        for (int i =1;i<=n;i++)
        {
            int maxValue = Integer.MIN_VALUE;
            for (int j=0;j<i;j++)
            {
                maxValue = Math.max(maxValue,price[j]+val[i-j-1]);
            }
            val[i] = maxValue;
        }
        return val[n];
    }

    public static int cutRod(int price[],int n)
    {
        if (n<=0)
            return 0;

        int maxValue = Integer.MIN_VALUE;

        for (int i =0;i<n;i++)
        {
            maxValue = Math.max(maxValue,price[i]+cutRod(price,n-i-1));
        }
        return maxValue;
    }



}
