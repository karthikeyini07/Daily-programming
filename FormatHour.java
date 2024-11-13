import java.util.*;
class FormatHour
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        int clk=x*y;
        if(clk==0 || clk>24)
        {
            System.out.print(-1);
        }
        else if(clk<=12)
        {
            System.out.print(clk);
        } 
        else if(clk>12){
            clk=clk-12;
            System.out.print(clk);
        }
        
    }
    
}
