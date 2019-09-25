package com.dsa.search;

public class FindTheSparseString
{

    public static void main(String[] args) {
        String[] strings = {"car","","","","","ball","","","","bat"};
        System.out.println("index of ball is : "+search(strings,"bals"));
    }



  static int search(String[] strings,String str)
  {
      if (strings==null||str==null||str=="")
          return  -1;
      return search(strings,str,0,strings.length-1);
  }




    private static int search(String[] strngs,String str,int first,int last)
    {
        if (first>last)
            return -1;
        int mid = first+(last-first)/2;

        if (strngs[mid].isEmpty())
        {
            int left = mid-1;
            int right = mid+1;
            while (true)
            {
                if (left<first && right>last)
                    return -1;
                else if (right<=last&&!strngs[right].isEmpty()) {
                    mid = right;
                    break;
                }else  if (left>=first && !strngs[left].isEmpty())
                {
                    mid = left;
                    break;
                }
                left--;
                right++;

            }


        }
        if (strngs[mid].equals(str))
            return mid;
        else if(strngs[mid].compareTo(str)<0)
            return search(strngs,str,mid+1,last);
        else
            return search(strngs,str,first,mid-1);


    }


}
