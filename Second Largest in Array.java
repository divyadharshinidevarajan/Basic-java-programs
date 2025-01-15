import java.util.*;

public class SecondLargestUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) 
        {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        boolean found = false;

        for (int i = arr.length - 2; i >= 0; i--) 
        {
            if (arr[i] != largest) 
            {
                System.out.println("The second largest element is " + arr[i] + ".");
                found = true;
                break;
            }
        }
        if (!found) 
        {
            System.out.println("No second largest element.");
        }

        scanner.close();
    }
}
