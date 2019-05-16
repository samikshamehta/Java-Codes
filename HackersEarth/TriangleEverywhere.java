import java.util.Scanner;


public class TriangleEverywhere 
{
	private static Scanner s = new Scanner(System.in);
	public static void main(String args[] ) throws Exception
	{
		try
		{
			int t=s.nextInt();
			long arr[]=new long[100000];
			for(int i=0;i<t;i++)
			{
				long sum=1;
				arr[0]=1;
				int n=s.nextInt();	
				if(arr[n]!=0)
				{
					System.out.println((arr[n])%1000000007);
				}
				else
				{
					for(int j=1;j<=n;j++)
					{
						if(arr[j]==0)
						{
							long val=(int)((4*(Math.pow(3,j-1)))%1000000007);
							sum=sum+val;
							arr[j]=sum;
						}
						else
						{
							sum=arr[j];
						}
					}
					System.out.println((arr[n])%1000000007);
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
}