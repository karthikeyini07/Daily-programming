import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       int m=obj.nextInt();
       int sum1=0;
       int sum2=0;
       for(int i=1;i<=m;i++)
       {
           if(i%n==0)
           {
               sum1+=i;
           }
           else{
               sum2+=i;
           }
       }
       int k=Math.abs(sum2-sum1);
       System.out.println(k);
        
    }
}
