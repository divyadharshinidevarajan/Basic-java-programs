import java.util.Scanner;

public class Main 
{  // Change class name to Main

    public static void main(String[] args) 
  {
        // Create an array to store daily sales for a week
        double[] sales = new double[7];
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input sales for each day of the week
        System.out.println("Enter the sales for each day of the week (Monday to Sunday):");
        for (int i = 0; i < 7; i++) 
        {
            System.out.print("Day " + (i + 1) + ": ");
            sales[i] = scanner.nextDouble();
        }
        
        // Calculate total sales for the week
        double totalSales = 0;
        for (int i = 0; i < 7; i++) 
        {
            totalSales += sales[i];
        }
        
        // Find the highest and lowest sales
        double highestSales = sales[0];
        double lowestSales = sales[0];
        
        for (int i = 1; i < 7; i++)
        {
            if (sales[i] > highestSales)
            {
                highestSales = sales[i];
            }
            if (sales[i] < lowestSales) 
            {
                lowestSales = sales[i];
            }
        }
        
        // Calculate total sales for the weekend (Saturday and Sunday)
        double weekendSales = sales[5] + sales[6]; // Saturday (index 5) and Sunday (index 6)
        
        // Output the results
        System.out.println("\nTotal sales for the week: " + totalSales);
        System.out.println("Highest sales in the week: " + highestSales);
        System.out.println("Lowest sales in the week: " + lowestSales);
        System.out.println("Total sales for the weekend (Saturday and Sunday): " + weekendSales);
        
        // Close the scanner
        scanner.close();
    }
}
