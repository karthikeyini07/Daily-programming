import java.util.*;
class StringRepeat
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
String s=obj.next();
String res=repeatString(s,n);
System.out.print(res);
}
  public static  String repeatString(String s,int n)
  {
    StringBuilder sb=new StringBuilder();
    if(n<0)
    {
        return "invalid";
    }
    
    for(int i=0;i<n;i++)
      {
        sb.append(s);
      }
    return sb.toString();
  }
    
}
