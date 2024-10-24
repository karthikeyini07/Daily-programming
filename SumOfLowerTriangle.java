import java.util.*;
class Triangle
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int[][] arr=new int[n][n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
    arr[i][j]=obj.nextInt();
      }
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
       sum+=arr[i][j];
      }
    }
    System.out.print(sum);
  }
}
