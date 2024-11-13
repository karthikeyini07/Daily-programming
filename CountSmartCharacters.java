import java.util.*;
class k
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    String str=obj.nextLine();
    int s=0;
    for(int i=0;i<str.length();i++)
    {
      char var=str.charAt(i);
      if((var>='a'&&var<='z'||var>='A'&&var>='Z'||var<='0'&&var>='9'))
      {
       s++;
      }
    }
    System.out.print(s+" ");
  }
  
}
