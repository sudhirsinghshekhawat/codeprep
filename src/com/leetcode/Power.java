package com.leetcode;

public class Power
{



    public double pow1(double x, int n)
    {
        if (x==0)
            return  0;
        if (n==0)
            return  1;

        double result  = 1;
        for(int i=1;i<=n;i++)
        {
            result = result*x;
        }
        return result;
    }

    public double pow(double x, int n)
    {
        if (n<0)
            return  1/power(x,-n);
        else
            return power(x,n);


    }

    public  double power(double x,int n)
    {
        if (n==0)
            return 1;

        double v = pow(x,n/2);
        if (n%2==0)
            return v*v;
        else
            return v*v*x;
    }


}
