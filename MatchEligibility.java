import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int k=obj.nextInt();
        int[] arr=new int[3];
        for(int i=0;i<3;i++)
        {
            arr[i]=obj.nextInt();
        }
        int sum=0;
        for(int i=0;i<3;i++)
        {
           sum+=arr[i];
        }
        int l=k*n;
        int b=l-sum;
        if(b>m)
        {
            System.out.print(-1);
        }
        else{
        System.out.println(b);
        }
    }
}
