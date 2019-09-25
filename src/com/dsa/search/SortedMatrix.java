package com.dsa.search;

public class SortedMatrix {

    public static void main(String[] args) {


        int matrix[][] =
                {
                        {1, 2, 3},
                        {2, 3, 4}
                };
        findDataInSortedMatrix(matrix,4);



    }



    public static void findDataInSortedMatrix(int[][]matrix ,int data)
    {


        int length = matrix.length;
        int width = matrix[0].length;

        int start = 0;
        int end = length*width-1;

        while (start<=end)
        {
            int mid = (start+end)/2;
            int x  = mid/width;
            int y = mid%width;

            if (matrix[x][y]==data)
            {
                System.out.println(data+ " data exist in matrix");
                break;
            }
            else if (matrix[x][y] > data)
                end = mid-1;
            else
                start = mid+1;
        }

    }


}
