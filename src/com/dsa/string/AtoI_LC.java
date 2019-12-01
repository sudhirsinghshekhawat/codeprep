package com.dsa.string;

public class AtoI_LC
{

    public static void main(String[] args)
    {
       String str = "9223372036854775808";
       str = str.trim();
        System.out.println(atoi(str));

    }
    public static int atoi(String str)
    {
        str = str.trim();

        if(str==null||str.length()==0)
            return 0;
        char[] charString = str.toCharArray();

        int sign = 1;
        int i = 0;

        if (charString[0]=='-') {
            sign = -1;
            i++;
        }

        if (charString[0]=='+') {
            i++;
        }
        double res=0;

        for(;i<charString.length;i++)
        {
            if (isNumericChar(charString[i])==false)
                break;

            res = res*10+charString[i]-'0';
        }


        double num = res*sign;
        if (num>=Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(num <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return new Double(num).intValue();
    }

    private static boolean isNumericChar(char x)
    {
        return  (x>='0' && x<='9')?true:false;
    }


}
