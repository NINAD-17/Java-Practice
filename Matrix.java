import java.util.*;

class Matrix
{
	public static void main(String[] args)
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int i, j;

		Scanner sc = new Scanner(System.in);

		System.out.println("Input Matrix A: ");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Input Matrix B: ");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				b[i][j]=sc.nextInt();
			}
		}

		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				c[i][j]=a[i][j] + b[i][j];
			}
		}

		System.out.println("Addition of Matrix A & B: ");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}