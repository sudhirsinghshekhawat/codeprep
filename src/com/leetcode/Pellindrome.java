package com.leetcode;

public class Pellindrome {


    public static void main(String[] args) {
        int n = 551;
        System.out.println(isPellindrome(n));
        System.out.println(reverseNumber(-551));
    }


    public static boolean isPellindrome(int n) {
        int div = 1;

        while (n / div >= 10)
            div = div * 10;

        while (n!=0)
        {
            int left = n/div;
            int right = n%10;

            if (left!=right)
                return  false;

            n = (n%div)/10;
            div = div/100;
        }

        return  true;


    }


    public static  int reverseNumber(int n)
    {

        boolean negativeFlag = false;
        if (n<0) {
            negativeFlag = !negativeFlag;
            n = n*-1;
        }

        int rev=0;

        while (n>0)
        {
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }

        if (negativeFlag)
            return   (0-rev);
        else
            return rev;





    }

}
