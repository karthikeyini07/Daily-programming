import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int count = numberOfFactors(num);
        System.out.println(count);
    }
    public static int numberOfFactors(long num) {
        int count = 2; 
         //fill the code here
         for(long i=2;i*i<=num;i++)
         {
           if(num%i==0)
          {
            count+=2;
          }
         }
          if((long)Math.sqrt(num)*(long)Math.sqrt(num)==num)
          {
            count--;
          }
          return count;
}
}
