import java.util.*;
public class non_repeating
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Non-repeating elements are: ");
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
