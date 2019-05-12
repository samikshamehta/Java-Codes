import java.util.Scanner;


public class WavePrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int array[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=s.nextInt();
			}
		}
		wavePrint(array);
	}
	public static void wavePrint(int input[][]){
		int i,j;
		for(j=0;j<input[0].length;j++)
		{
			if(j%2==0)
			{
				for(i=0;i<input.length;i++)
				{
					System.out.print(input[i][j]+" ");
				}
			}
			else
			{
				for(i=input.length-1;i>=0;i--)
				{
				}
			}
		}
	}
}
