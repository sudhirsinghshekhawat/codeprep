package com.dsa.dp;

public class LongestPallindromincSubsequence {

    public static void main(String[] args)
    {
        String str = "adbbca";
        System.out.println(lps(str));

    }


    public static int lps(String str) {
        int len = str.length();


        int table[][] = new int[len][len];

        for (int i = 0; i < len; i++)
            table[i][i] = 1;

        for (int sl = 2; sl <=len; sl++) {
            for (int i = 0; i < len - sl + 1; i++) {
                int j = i + sl - 1;
                if (str.charAt(i) == str.charAt(j) && sl == 2)
                    table[i][j] = 2;
                else if (str.charAt(i) == str.charAt(j))
                    table[i][j] = table[i + 1][j - 1] + 2;
                else
                    table[i][j] = Math.max(table[i][j - 1], table[i + 1][j]);

            }
        }


        int pLength =  table[0][len-1];

        char[] pelindrome = new char[pLength];

        int start=0;
        int end = pLength-1;
        int i=0;
        int j = len-1;

        while (end-start>=1)
        {
            if (str.charAt(i)==str.charAt(j)) {
                pelindrome[start] = str.charAt(i);
                pelindrome[end] = str.charAt(i);
                start += 1;
                end -= 1;
                i++;
                j--;
            }else
            {
                if (table[i+1][j]>table[i][j-1])
                    i++;
                else
                    j--;
            }
        }
        System.out.println(new String(pelindrome));

        return table[0][len-1];


    }


}
