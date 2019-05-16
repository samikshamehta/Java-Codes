import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class CodeArenaproblemstatement {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int p=s.nextInt();
			int x[]=new int[2];
			int y[]=new int[2];
			int profit[][]=new int[n][2];
			for(int j=0;j<n;j++)
			{
				x[j]=s.nextInt();
				y[j]=s.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<2;k++)
				{
					if(k==0)
					{
						profit[j][k]=j;
					}
					else
					{
						profit[j][k]=x[j]-y[j];
					}
				}
			}
}
