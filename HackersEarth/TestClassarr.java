import java.util.Scanner;


public class TestClassarr {
	public static void main(String[] args)
	{
		try{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int o=s.nextInt();
		int mul=1;
		for(int i=0;i<o;i++)
		{
			int d=s.nextInt();
			if(d!=0)
			{
				mul=mul*d;
			}
		}
		for(int j=0;j<n;j++)
		{
			System.out.print((arr[j]/mul)+" ");
		}}
		catch(Exception e)
		{
			
		}
	}
}
