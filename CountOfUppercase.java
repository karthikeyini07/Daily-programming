import java.util.*;
class k
{
  static int count_upper(String str)
  {
    int count=0;
    for(int i=0;i<str.length();i++)
    {
      if(Character.isUpperCase(str.charAt(i)))
      {
    count++;
      }
  }
  return count;
}
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  int r=count_upper(str);
  System.out.print(r);
}
}

