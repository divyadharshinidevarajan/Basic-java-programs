import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) 
        {
            String s = scanner.next();
            int count = 0;
            String str="aeiou";
            for (int i = 0; i < s.length()-2; i++) 
            {
                char x = s.charAt(i);
                char y = s.charAt(i + 1);
                char z = s.charAt(i + 2);
                if(str.indexOf(x) != -1 && str.indexOf(y) != -1 && str.indexOf(z) != -1)
                {
                    count++;
                    System.out.println("Happy");
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Sad");
            }
        }
    }
}
