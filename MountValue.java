import java.util.*;
class mountvalue
  {
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      String s=obj.nextInt();
      int count=0;
      int high=0;
      for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='u')
          {
            high++;
            if(high==0)
            {
              count++;
            }
          }
          else
          {
            high--;
          }
        }
      System.out.print(count);
    }
  }
