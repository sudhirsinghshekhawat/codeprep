package com.dsa.dp;

public class MatrixMultiplicationCost {

    public static void main(String[] args) {
        MatrixMultiplicationCost matrixMultiplicationCost = new MatrixMultiplicationCost();
        int arr[] = {4,2,3,5,3};
        int cost = matrixMultiplicationCost.findCost(arr);
        System.out.println("cost : "+cost);
    }



    public  int findCost(int arr[])
    {
        int temp[][] = new int[arr.length][arr.length];
        int q = 0;

        for (int l =2;l<arr.length;l++)
        {
            for (int i=0;i<arr.length-1;i++)
            {
                int j = i+1;
                temp[i][j]=Integer.MAX_VALUE;
                for (int k = i+1;k<j;k++)
                {
                    q = temp[i][k]+temp[k][j]+arr[i]*arr[k]*arr[j];
                    if (q<temp[i][j])
                        temp[i][j]=q;
                }
            }
        }
        return temp[0][arr.length-1];
    }

}
