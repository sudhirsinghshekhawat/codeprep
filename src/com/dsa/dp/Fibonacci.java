package com.dsa.dp;

public class Fibonacci {


    public static void main(String[] args)
    {
        //5 = 0,1,1,2,3
        int n5 = fibonaci(4);
        System.out.println("n5 = "+n5);
        System.out.println("n5 Recursive = "+fibonaciRecursive(4));
        System.out.println("n5 Dynamic = "+fibonaciDynamic(4));




        //6 = 0,1,1,2,3,5
//        int n6 = fibonaci(6);
//        System.out.println("n6 = "+n6);
    }



    public  static  int fibonaciDynamic(int n)
    {
        int[] fb = new int[n+1];
        fb[0] = 0;
        fb[1] = 1;

        for(int i = 2;i<=n;i++)
        {
            fb[i] = fb[i-1]+fb[i-2];
        }
        return  fb[n];
    }



    public static int fibonaciRecursive(int n)
    {
        if(n==0)
            return  0;
        if (n==1)
            return  1;
           return fibonaciRecursive(n-1)+fibonaciRecursive(n-2);
    }


    public static int fibonaci(int n)
    {
        int a=0 ,b=1,sum=0;

        for(int i=2;i<=n;i++)
        {
            sum = a+b;
            a = b;
            b = sum;
        }
        return  sum;
    }





}
