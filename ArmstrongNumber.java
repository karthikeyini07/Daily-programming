import java.util.*;
class k
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    int num=obj.nextInt();
    int temp=num,count=0;
    int sum=0;
    while(temp!=0)
    {
      count++;
      temp/=10;
    }
    temp=num;
    while(temp!=0)
    {
      sum+=power(temp%10,count);
      temp/=10;
   }
   if(num==sum)
   System.out.print("Armstrong");
   else
   {
     System.out.print("Not an Armstrong number");
   }
    pubstatic int power(int base,int exp)
   {
     int res=1;
     for(int i=1;i<=exp;i++)
       res*=base;
     return res;
   }
  }
