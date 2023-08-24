import java.util.*;

class Table
{
	public static void main(String[] args)
	{
		int num, i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		num = sc.nextInt();

		for(i=1; i<=10; i++)
		{
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}		