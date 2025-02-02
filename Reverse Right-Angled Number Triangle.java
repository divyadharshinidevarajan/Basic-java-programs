import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int size = scan.nextInt();
        for (int i = size; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
