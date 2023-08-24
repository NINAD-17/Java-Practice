import java.util.*;

class Area
{
	public static void main (String[] args)
	{
	 float base, height, area;
	 
	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter the value of base: ");
	 base = sc.nextFloat();
	 
	 System.out.println("Enter the value of height: ");
	 height = sc.nextFloat();

	 area = (base * height)/2;
	 System.out.println("Area of triangle is: " + area);
	}
}