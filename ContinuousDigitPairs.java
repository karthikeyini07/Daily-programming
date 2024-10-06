import java.util.*;
class k
{
  public static void main(String[] ags)
  {
    Scanner obj=new Scanner(System.in);
    long n=obj.nextLong();
    int count=0;
    while(n!=0)
    {
      long m=n%10;
        count++;
      n/=10;
    }
    if(count%2==0)
    {
      long p= count/2;
    System.out.print(p);
  } else
  {
    System.out.print("1");
  }
}
}
