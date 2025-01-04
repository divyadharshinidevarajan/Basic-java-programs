import java.util.Scanner;
public class CountWords{
public static int counts(String a){
    a = a.trim();
    if (a.isEmpty()) {
        return 0;
    }
    int count =1;
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)==' '){
            count++;
        }
       
    }
    return count;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the sentence: ");
    String a=sc.nextLine();
    System.out.println("The no of words: "+counts(a));

}
}
