import java.util.Scanner;


public class TestClass
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
		int o=s.nextInt();
		for(int i=0;i<o;i++)
		{
			int d=s.nextInt();
			for(int j=0;j<n;j++)
			{
				arr[j]=arr[j]/d;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
