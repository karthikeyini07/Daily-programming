import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    int[] arr=new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=obj.nextInt();
	    }
	    int t=obj.nextInt();
	    System.out.print(TypeofChoci(n,arr,t));
	    
	}
	public static int TypeofChoci(int n,int[] arr,int t)
	{
	    Arrays.sort(arr);
	    int sum=0;
	    if(n<t)
	    {
	        return -1;
	    }
	    for(int i=0;i<t;i++)
	    {
	        sum=sum+arr[i];
	    }
	    return sum;
	    
	    
	}
}
