import java.util.*;
class Matrix
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int m=obj.nextInt();
    int[][] arr=new int[n][m];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        arr[i][j]=obj.nextInt();
      }
    }
    boolean isteoplitz=true;
    for(int i=1;i<n;i++)
    {
      for(int j=1;j<m;j++)
      {
        if(arr[i][j]!=arr[i-1][j-1])
        {
          isteoplitz=false;
          break;
        }
      }
    }
    if(isteoplitz)
    {
      System.out.print("Toeplitz matrix");
    }else
    {
      System.out.print("Not a Toeplitz matrix");
    }
  }
}
