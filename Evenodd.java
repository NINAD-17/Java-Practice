import java.util.*;

class Evenodd 
{
 	public static void main (String[] args)
	{
	 int num1, num2;
	 
	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter the value of num1: ");
	 num1 = sc.nextInt();
	 

	 if ((num1 % 2) == 0)
	 {
	  System.out.println("Given number is even");
	 }
	 else
	 {
 	  System.out.println("Given number is odd");
	 }
	}
}