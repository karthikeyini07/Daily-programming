import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
      Scanner obj=new Scanner(System.in);
      
      String str=obj.nextLine();
      System.out.print(Repeatedfunction(str));
    }
    public static boolean Repeatedfunction(String str)
    {
        int mapHash[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            mapHash[str.charAt(i)-'a']++;
            if(mapHash[str.charAt(i)-'a']>1)
            return false;
            
        }
        return true;
    }
}
