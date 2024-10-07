import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int stabilizedvalue=stabilizeSystem(num);
		System.out.print(stabilizedvalue);
		
	}
	public static int stabilizeSystem(int num)
	{
	    String numstr=Integer.toString(num);
	    numstr=numstr.replace("0","5");
	    return Integer.parseInt(numstr);
	}
}
	
