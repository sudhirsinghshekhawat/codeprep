package com.basics;

public class MatrixMultiplication {


    public static void main(String[] args) {

        int m1[][] =
                {
                        {2, 2},
                        {2, 2}
                };

        int m2[][] =
                {
                        {2, 2},
                        {2, 2}
                };

        printMatrix(m1);
        System.out.println("---------");

        printMatrix(m2);
        System.out.println("---------");

        printMatrix(matrixMultiplication(m1,m2));
    }


    public static int[][] matrixMultiplication(int[][] m1, int[][] m2) {


        int m1Rows = m1.length;
        int m1Column = m1[0].length;


        int m2Rows = m2.length;
        int m2Column = m2[0].length;


        int m3[][] = new int[m1Rows][m1Column];

        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m1Column; j++) {
                for (int k = 0; k < m1Rows; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m3;
    }


    public static void printMatrix(int[][] matrix)
    {
        int rows = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


}
