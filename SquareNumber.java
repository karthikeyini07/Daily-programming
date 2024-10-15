import java.util.*;
class square
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    long n=obj.nextLong();
    while(n!=0)
    {
    double p=n%10;
    double sq=Math.sqrt(n);
    double l=sq%10;
    double r=l/10;
    if((p==l)||(p==r)&&(p>0)&&(r>0)&&(n>0))
   
    {
      System.out.print("Correct Number");
      break;
    } 
     else if(n<0||n!=l)
     {
       System.out.print("Wrong Number");
       break;
     }
    } 
  }
}
