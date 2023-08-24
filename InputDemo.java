import java.util.*;

class InputDemo
{
	public static void main (String[] args)
	{
	 int a;
	 float b;
	 double c;
	 String name;

	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter the value of a: ");
	 a = sc.nextInt();

	 System.out.println("Enter the value of b: ");
	 b = sc.nextFloat();

 	 System.out.println("Enter the value of c: ");
	 c = sc.nextDouble();

	 System.out.println("Enter the name: ");
	 name = sc.next();

	 System.out.println("Value of a = " + a);
	 System.out.println("Value of b = " + b);
	 System.out.println("Value of c = " + c);
	 System.out.println("Value of name = " + name);
	}
}