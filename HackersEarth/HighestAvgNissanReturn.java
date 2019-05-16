import java.util.ArrayList;
import java.util.Scanner;


public class HighestAvgNissanReturn {
	public static void main(String[] args) throws Exception
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int result[][]=subsets(arr);
		ArrayList<Integer>avg=new ArrayList<Integer>();
		for(int i=0;i<result.length;i++)
		{
			int sum=0;
			for(int j=0;j<result[i].length;j++)
			{
				sum+=result[i][j];
			}
			if(sum!=0)
			{
				avg.add(sum/result[i].length);
			}
		}
		int q=s.nextInt();
		for(int l=0;l<q;l++)
		{
			int k=s.nextInt();
			int max=Integer.MIN_VALUE;
			for(int i=0;i<avg.size();i++)
			{
				if(avg.get(i)<k)
				{
					if(max<result[i].length)
					{
						max=result[i].length;
					}
				}
			}
			if(max!=Integer.MIN_VALUE)
			{
				System.out.println(max);
			}
			else
			{
				System.out.println(0);

			}
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