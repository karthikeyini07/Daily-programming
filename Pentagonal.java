import java.util.*;
class pentagonal
{
  public static boolean ispent(int n)
  {
    
    double d=1+24*n;
    double sq=Math.sqrt(d);
    if(sq%1!=0)
    return false;
    double x=(1+sq)/6;
    return x%1==0;
  }
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    System.out.print(ispent(n)?"Pentagonal Number":"Not a Pentagonal Number");
    
  }
  }
