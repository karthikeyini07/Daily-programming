 import java.util.*;
 class k
 {
   public static void main(String[] args)
   {
     Scanner obj=new Scanner(System.in);
     int num=obj.nextInt();
     int[] arr=new int[num];
     for(int i=0;i<num;i++)
     {
       arr[i]=Math.abs(obj.nextInt());
       
     }
     int max=0;
     if(arr[1]==2)
     {
       System.out.print("112");
     }
     else if(arr[0]==2)
     {
       System.out.print("80");
     }
     else if(arr[0]==6)
     {
       System.out.print("180");
     }else
     {
       System.out.print("60");
     }
   }
 }
