import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int diff=obj.nextInt();
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print(findcount(arr,size,n,diff));
    }
    
    public static int findcount(int arr[],int size,int n,int diff)
    {
        int count=0;
        for(int i=0;i<size;i++)
        {
           if(Math.abs(arr[i]-n)<=diff){
               count++; 
            }
        }
        if(count==0)
        {
            return -1;
        }
        return count;
    }
    
} 
