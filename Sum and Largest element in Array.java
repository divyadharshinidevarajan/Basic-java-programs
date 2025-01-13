import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the array elements
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate the sum of the elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // Find the largest element
        int largest = array[0];
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest element: " + largest);
    }
}
