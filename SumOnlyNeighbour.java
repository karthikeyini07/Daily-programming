import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n =obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print(findsum(arr,n));
    }
    
    public static int findsum(int arr[],int n)
    {
        Arrays.sort(arr);
        int sum=0;
        sum=Math.abs((arr[1]-arr[0])+(arr[n-1]-arr[n-2]));
           int a1,a2;
           for(int i=1;i<n-1;i++)
           {
               a1=arr[i]-arr[i-1];
               a2=arr[i+1]-arr[i];
               sum+=Math.abs(Math.min(a1,a2));
               
           }
           return sum;
    }
}
