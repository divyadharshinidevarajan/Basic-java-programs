import java.util.Scanner;
public class palindrom
{
  public static void palindrom(String str) 
    {
        int x=str.length();
        String str1="";
        for(int i=x-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        System.out.println(str1);
        if(str.equals(str1))
        {
            System.out.println(str+" is palindrom");
        }
        else
        {
            System.out.println(str+" is not a palaindrom!");
        }
    }
  public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str=scan.nextLine();
        palindrom(str);
    }
}
