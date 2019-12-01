package com.dsa.dp;

public class MaxSubSquareMatrix
{

    public static void main(String[] args) {
        int arr[][] = {{0,1,1,0,1},{1,1,1,0,0},{1,1,1,1,0},{1,1,1,0,1}};
        MaxSubSquareMatrix mssm = new MaxSubSquareMatrix();
        int result = mssm.maxSize(arr);
        System.out.print(result);

    }

    private int min(int a ,int b,int c)
    {
        int min = Math.min(a,b);
        return Math.min(min,c);
    }


    private int maxSize(int[][] matrix)
    {
        int max = 0;
        int[][] result = new int[matrix.length][matrix[0].length];

        for(int i=0; i < matrix.length; i++){
            result[i][0] = matrix[i][0];
            if (result[i][0] == 1)
            {
                max = 1;
            }
        }

        for(int i=0; i < matrix[0].length; i++){
            result[0][i] = matrix[0][i];
            if (result[0][i] == 1)
            {
                max = 1;
            }

        }

        for (int i=1;i<matrix.length;i++)
        {
            for (int j=1;j<matrix[i].length;j++)
            {
                if (matrix[i][j]==0)
                    continue;
                int t = min(result[i-1][j],result[i][j-1],result[i-1][j-1]);
                result[i][j] = t+1;

                if (result[i][j]>max)
                    max = result[i][j];
            }
        }
        return  max;
    }










}
