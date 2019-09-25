package com.dsa.dp;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCABA";
        System.out.println("LCS Length : "+LCSLength(X,Y));
        System.out.println("LCS length Dynamic : "+LCSLengthDynamic(X,Y));

    }

    public static String LCSLengthDynamic(String X,String Y)
    {
        int table[][] = new int[X.length()+1][Y.length()+1];

        for(int i=0;i<=X.length();i++)
        {
            for(int j=0;j<=Y.length();j++)
            {
                if(i==0||j==0)
                    table[i][j]=0;
                else if (X.charAt(i-1)==Y.charAt(j-1))
                    table[i][j]=table[i-1][j-1]+1;
                else
                    table[i][j]= Math.max(table[i][j-1],table[i-1][j]);
            }
        }

        StringBuffer sb = new StringBuffer();
        int x = X.length(),y=Y.length();

        while (x>0 && y > 0)
        {
            if (X.charAt(x-1)==Y.charAt(y-1)) {
                sb.append(X.charAt(x - 1));
                x--;
                y--;
            } else if(table[x-1][y]>table[x][y-1])
            {
                x--;
            } else
            {
                y--;
            }
        }

        return sb.reverse().toString();

    }



    public static String LCSLength(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        if (m == 0 || n == 0)
            return "";
        else if (X.charAt(m - 1) == Y.charAt(n - 1))
            return LCSLength(X.substring(0, m - 1), Y.substring(0, n - 1))+X.charAt(m-1);
        else {
            String x = LCSLength(X, Y.substring(0, n - 1));
            String y = LCSLength(X.substring(0, m - 1), Y);
            return x.length() > y.length() ? x : y;
        }

    }


}
