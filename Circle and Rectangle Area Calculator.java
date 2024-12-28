import java.util.Scanner;
public class area
{
	public static double areaofcircle(double r)
	{
		double abc=3.14*r*r;
		return abc;
	}
	public static double areaofrectangle(double l, double b)
	{
		double area=l*b;
		return area;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Radius: ");
		double x=scan.nextDouble();
		System.out.println("Area of Circle: "+areaofcircle(x));
		System.out.print("Enter Length: ");
		double y=scan.nextDouble();
		System.out.print("Enter Breath: ");
		double z=scan.nextDouble();
		System.out.println("Area of Rectangle: "+areaofrectangle(y, z));
		scan.close();
	}
}
