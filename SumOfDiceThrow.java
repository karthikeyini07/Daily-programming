import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      System.out.print(sum(n));
      
    }
    public static int sum(int n)
    {
        int count=0;
        for(int i=1;i<=6;i++)
        {
            if(n-i<=6)
            {
                System.out.println(n-i+" , "+i);
                count++;
                
            }
            
        }
        return count;
    }
    
}
