import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine();
        String str2=obj.nextLine();
        System.out.print(CountStr(str1,str2));
    }
    public static int CountStr(String str1,String str2)
    {
        int count1=0;
        int count2=0;
        char ch;
        for(int i=0;i<str1.length();i++)
        {
          ch=str1.charAt(i);
          if(ch == ' '){
              count1++;
          }
        }
        for(int i=0;i<str2.length();i++)
        {
          ch=str2.charAt(i);
          if(ch == ' '){
              count2++;
          }
        }
        int count=Math.abs(count1-count2);
        if(count%2==0){
            System.out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }
        
        return count;
    } 
}

