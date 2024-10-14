import java.util.*;
class MagicNumber
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    int num=obj.nextInt();
    int sum=0;
    int p=num;
    while(num>0)
    {
      sum+=num%10;
      num/=10;
    }
    int rev=0;
    int temp=sum;
    while(temp>0)
    {
      rev=rev*10+temp%10;
      temp/=10;
    }
    int pro=sum*rev;
    if(pro==p)
    {
      System.out.print("YES");
    }else
    {
      System.out.print("NO");
    }
  }
}
