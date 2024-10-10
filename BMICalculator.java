import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int w=obj.nextInt();
        float h=obj.nextFloat();
        int bmicategory=BMI(w,h);
        System.out.print(bmicategory);
        
    }
    public static int BMI(int w,float h)
    {
        float bmi=w/(h*h);
        if(bmi<18)
        {
            return 0;
        }
        if((18<=bmi)&&(bmi<25)){
            return 1;
        }
        if((25<=bmi)&&(bmi<30))
        {
            return 2;
        }
        if((30<=bmi)&&(bmi<40)){
            return 3;
        }
        if(bmi>=40){
            return 4;
        }
        else{
            return -1;
        }
    }
}
    
