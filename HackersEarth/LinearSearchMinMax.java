import java.util.Scanner;


public class LinearSearchMinMax {
	private static Scanner s = new Scanner(System.in);
	public static void main(String args[] ) throws Exception
	{
			int n=s.nextInt();
			int arr[]=new int[n];
			int sum=0;
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
				sum=sum+arr[i];
			}
			int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				int val=sum-arr[i];
				if(val<=min)
				{
					min=val;
				}
				if(val>=max)
				{
					max=val;
				}
			}
			System.out.println(min+" "+max);
	}
}