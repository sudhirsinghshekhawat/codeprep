package com.dsa.dp;

public class Factorial
{


    public static void main(String[] args)
    {

        System.out.println("n5 factorial : "+factorial(5));
        System.out.println("n5 factorial recursion : "+factorialRecursive(5));
        System.out.println("n5 Dynamic : "+facorialDynamic(5));




    }


    public  static  int facorialDynamic(int n)
    {
        int factorial[] = new int[n+1];

        if (n==0)
            return  1;
        else if(n==1)
            return  1;
        else if(factorial[n]!=0)
            return  factorial[n];
        else
            return  factorial[n] = n * facorialDynamic(n-1);
    }


    public static  int factorialRecursive(int n)
    {
        if(n<=1)
            return  1;
        return  n*factorial(n-1);
    }



    public  static  int factorial(int n)
    {
        int factorial = 1;
        while(n>0)
        {
            factorial = n*factorial;
            n--;
        }
        return  factorial;
    }



}
