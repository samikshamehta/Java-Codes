import java.util.Scanner;


public class RecursiveReturnSubsetOfArray 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int result[][]=subsets(arr);
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[i].length;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] subsets(int input[])
	{
		if(input.length==0)
		{
			int ans[][]={{}};
			return ans;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallArray[i-1]=input[i];
		}
		int number=input[0];
		int smallResult[][]=subsets(smallArray);
		int ans[][]=new int[smallResult.length*2][];
		int k = 0;
		for(int i=0;i<smallResult.length;i++)
		{
			ans[k]=new int[smallResult[i].length+1];
			ans[k][0] = number;
			for(int j=0;j<smallResult[i].length;j++)
			{
				ans[k][j+1]=smallResult[i][j];	
			}
			k++;
		}
		for(int i=0;i<smallResult.length;i++)
		{
			ans[k]=new int[smallResult[i].length];
				for(int j=0;j<smallResult[i].length;j++)
				{
					ans[k][j]=smallResult[i][j];
				}
				k++;
		}
		return ans;
	}
}