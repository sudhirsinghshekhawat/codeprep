package com.dsa.dp;

public class CalatanNumber {


    public static void main(String[] args) {

       System.out.println("Calatan Number : " + calatanNumber(3));
    }









    //without dynamic programing
    public static int calatanNumber(int n) {
        if (n == 0)
            return 1;
        int count = 0;
        for (int i = 1; i <= n; i++)
            count += calatanNumber(i - 1) * calatanNumber(n - i);
        return count;
    }


}
