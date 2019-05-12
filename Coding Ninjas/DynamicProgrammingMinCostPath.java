import java.util.Scanner;


public class DynamicProgrammingMinCostPath {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int input[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				input[i][j]=s.nextInt();
			}
		}
		int ans=minCostPath(input);
		System.out.println(ans);
	}
	public static int minCostPath(int input[][]) 
	{
		int m=input.length;
		int n=input[0].length;
		int dp[][]=new int[m+1][n+1];
		dp[0][0]=input[0][0];
		for(int i=1;i<m;i++)
		{
			dp[i][0]=dp[i-1][0]+input[i][0];
		}
		for(int j=1;j<n;j++)
		{
			dp[0][j]=dp[0][j-1]+input[0][j];
		}
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+input[i][j];
			}
		}
		return dp[m-1][n-1];
	}

}
