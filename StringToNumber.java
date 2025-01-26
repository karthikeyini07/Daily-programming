import java.util.*;
class k
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    String str=obj.nextLine();
    int flag=0;
    for(int i=0;i<=str.length();i++)
    {
      char ch=str.charAt(i);
      if(!(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
      {
      System.out.print(ch);
      flag++;
      }
  }
  if(flag==0)
  {
    System.out.print("0");
  }
}
}
