import java.util.Scanner;


public class RowWiseSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int sum=0;
		int array[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				//System.out.println(array[i][j]+" ");
				sum=sum+array[i][j];	
			}
			System.out.print(sum+" ");
			sum=0;
		}
	}
}