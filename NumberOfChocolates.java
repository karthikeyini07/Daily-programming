
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int sum=obj.nextInt();
	int k=obj.nextInt();
	int prev=0;
	
	for(int i=1;i<k;i++)
	{
	    prev=sum-1;
	    sum=sum+prev;
	}
	System.out.print(sum);
	}
}
