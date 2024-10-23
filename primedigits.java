import java.util.*;
class PrimeNumber
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    long n=obj.nextLong();
    long[] digits=new long[16];
    int index=0;
    long temp=n;
    while(temp>0)
    {
      digits[index++]=temp%10;
      temp/=10;
    }
    for(int i=index-1;i>=0;i--)
    {
      long digit=digits[i];
      if(digit==2||digit==3||digit==5||digit==7)
      {
        System.out.print(digit+" ");
      }
    }
  }
}
