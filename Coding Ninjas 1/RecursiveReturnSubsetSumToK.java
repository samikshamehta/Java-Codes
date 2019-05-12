import java.util.Scanner;


public class RecursiveReturnSubsetSumToK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		int result[][]=subsetsSumK(arr,k);
		for(int i=0;i<result.length;i++)
		{
				for(int j=0;j<result[i].length;j++)
				{
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
		}
	}
	public static int[][] subsetsSumK(int input[], int k) {
		int rlt[][]=SubsetsSumK(input,k);
		int result[][]=new int[rlt.length][];
		int r=0,count=0;
		for(int i=0;i<rlt.length;i++)
		{
			int val=0;
			result[r]=new int[rlt[i].length];
			for(int j=0;j<rlt[i].length;j++)
			{
				val=val+rlt[i][j];
			}
			if(val==k)
			{
				for(int j=0;j<rlt[i].length;j++)
				{
					result[r][j]=rlt[i][j];
				}
				count++;
				r++;
			}
		}
		int ans[][]=new int[count][];
		int a=0;
		for(int i=0;i<result.length;i++)
		{
			if(result[i]!=null && result[i].length>0 )
			{
				ans[a]=new int[result[i].length];
				for(int j=0;j<result[i].length;j++)
				{
					ans[a][j]=result[i][j];
				}
			}
			a++;
		}
		return ans;
	}
	public static int[][] SubsetsSumK(int input[], int k) 
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
		int smallResult[][]=SubsetsSumK(smallArray,k);
		int ans[][]=new int[smallResult.length*2][];
		int l = 0;
		for(int i=0;i<smallResult.length;i++)
		{
			ans[l]=new int[smallResult[i].length+1];
			ans[l][0] = number;
			for(int j=0;j<smallResult[i].length;j++)
			{
				ans[l][j+1]=smallResult[i][j];
			}
			l++;
		}
		for(int i=0;i<smallResult.length;i++)
		{
			ans[l]=new int[smallResult[i].length];
				for(int j=0;j<smallResult[i].length;j++)
				{
					ans[l][j]=smallResult[i][j];
				}
				l++;
		}
		return ans;
	}
}
