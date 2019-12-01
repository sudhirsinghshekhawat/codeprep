package com.dsa.dp;

public class KnapSack01 {


    public static void main(String[] args) {

        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int weight = 50;

        printKnapSack(weight, wt, val);

    }


    static void printKnapSack(int weight, int wt[], int val[]) {
        int table[][] = new int[val.length + 1][weight + 1];

        for (int i = 0; i <= val.length; i++) {
            for (int w = 0; w <= weight; w++) {
                if (i == 0 || w == 0)
                    table[i][w] = 0;
                else if (wt[i - 1] <= w)
                    table[i][w] = Math.max(val[i - 1] + table[i - 1][w - wt[i - 1]], table[i - 1][w]);
                else
                    table[i][w] = table[i - 1][w];
            }
        }

        int maxValue = table[val.length][weight];
        System.out.println(maxValue);

        int w = weight;

        for (int i = val.length; i > 0 && maxValue > 0; i--) {
            if (maxValue == table[i - 1][w])
                continue;
            else {
                System.out.println(wt[i - 1] + "");
                maxValue = maxValue - val[i - 1];
                w = w - wt[i - 1];

            }
        }
    }


}
