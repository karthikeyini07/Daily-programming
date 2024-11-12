import java.util.*;
class binary
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    String str=Integer.toBinaryString(n);
    int count=0;
    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      if(ch=='1')
      {
        count++;
      }
    }
    System.out.print(count);
  }
}
