import java.util.Scanner;
public class MonkAndRotataion 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int k=s.nextInt();
			int arr[]=new int[n];
			int r=0,p=0;
			k=(k%n);
			int temp[]=new int[n-k];
			for(int j=0;j<n;j++)
			{
				arr[j]=s.nextInt();
			}
			for(int m=0;m<n;m++)
			{
				if(m<n-k)
				{
					temp[r++]=arr[m];
				}
				else
				{
					arr[p++]=arr[m];
				}
			}
			for(int q=0;q<n-k;q++)
			{
				arr[p++]=temp[q];
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}