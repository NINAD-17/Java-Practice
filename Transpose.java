import java.util.*;

class Transpose
{
	public static void main(String[] args)
	{
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int i, j, nRow, nCol;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		nRow = sc.nextInt();
		//System.out.println();

		System.out.print("Enter number of columns: ");
		nCol = sc.nextInt();
		System.out.println();

		System.out.println("Input Matrix A: ");
		for(i=0; i<nRow; i++)
		{
			for(j=0; j<nCol; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Transpose is: ");
		for(i=0; i<nCol; i++)
		{
			for(j=0; j<nRow; j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}
}