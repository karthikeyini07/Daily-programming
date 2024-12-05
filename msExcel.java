 import java.util.*;
 class mexcel
 {
   public static void main(String[] args)
   {
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
    
     System.out.print(col(n));
   }
   static String col(int n)
   {
     StringBuilder res=new StringBuilder();
    while(n>0)
    {
      n--;
      char c = (char) ('A'+(n%26));
      res.insert(0,c);
      n=n/=26;
      
    }
     return res.toString();
 }
 }
