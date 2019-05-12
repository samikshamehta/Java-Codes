import java.util.Scanner;


public class DynamicProgrammingLCS {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		int ans=lcs(s1,s2);
		System.out.println(ans);
		
	}
	public static int lcs(String s1, String s2)
	{
		char x[]=s1.toCharArray();
		char y[]=s2.toCharArray();
		int m=x.length;
		int n=y.length;
		int l[][]=new int[m+1][n+1];
		for(int i=0;i<m;i++)
		{
			l[0][i]=0;
		}
		for(int i=0;i<n;i++)
		{
			l[i][0]=0;
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(x[i-1]==y[j-1])
				{
					l[i][j]=l[i-1][j-1]+1;
				}
				else
				{
					l[i][j]=Math.max(l[i-1][j],l[i][j-1]);
				}
			}
		}
		return l[m][n];
	}		
}
