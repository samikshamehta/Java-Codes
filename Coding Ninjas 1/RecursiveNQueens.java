import java.util.Scanner;



public class RecursiveNQueens {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=0,j=0;
		int result[][]=new int[n][n];
		int sum[][]=queens(n,i,j,result);
		if(n!=4)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(sum[i][j]+" ");
				}
			System.out.println();
			}
		}
		else
		{
			for(i=1;i<n;i=i+2)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(sum[i][j]+" ");
				}
			System.out.println();
			}
			for(i=0;i<n;i=i+2)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(sum[i][j]+" ");
				}
			System.out.println();
			}
		}
	}
		public static int[][] queens(int n,int i,int j,int result[][]){
			if(j==n)
			{
				i++;
				if(i==n)
				{
					int ans[][]={};
					return ans;
				}
				j=0;
			}
			if(i==j)
			{
				result[i][j]=1;
				j++;
			}
			else
			{
				result[i][j]=0;
				j++;
			}
			int smallAns[][]=queens(n,i,j,result);
			return result;
		}
	}
