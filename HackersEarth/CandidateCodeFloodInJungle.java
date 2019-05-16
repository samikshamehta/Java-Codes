import java.util.ArrayList;
import java.util.Scanner;


public class CandidateCodeFloodInJungle
{
    public static void main(String args[] ) throws Exception
   	{
   		Scanner s = new Scanner(System.in);
   		int n=s.nextInt();
   		double C=s.nextDouble();
   		int c=(int)C;
   		int x[]=new int[n];
   		int y[]=new int[n];
   		int m[]=new int[n];
   		int t[]=new int[n];
   		int count=0;
   		ArrayList<Integer> arr=new ArrayList<>();
   		for(int i=0;i<n;i++)
   		{
   			x[i]=s.nextInt();
   			y[i]=s.nextInt();
   			m[i]=s.nextInt();
   			t[i]=s.nextInt();
   			if(m[i]>=t[i])
   			{
   				count++;
   				arr.add(i);
   			}
   		}
   		if(arr.size()>1)
   		{
   			System.out.println(-1);
   		}
   		else
   		{
   			if(arr.size()==1)
   			{
   	   			System.out.println(arr.get(0));
   			}
   			else
   			{
   				double dp[][]=new double[n][n];
   				for(int i=0;i<n;i++)
   				{
   					for(int j=i+1;j<n;j++)
   					{
   						double equ=Math.sqrt(((x[j]-x[i])*(x[j]-x[i]))+((y[j]-y[i])*(y[j]-y[i])));
   						if(dp[i][j]!=equ && dp[j][i]!=equ)
   						{
   							dp[i][j]=equ;
   							dp[j][i]=equ;
   						}   						
   					}
   				}
   				int flag=0;
   				ArrayList<Integer> ans=new ArrayList<>();
   				for(int i=0;i<n;i++)
   				{
   					for(int j=0;j<n;j++)
   					{
   						if(i!=j)
   						{
	   						if(dp[i][j]<=c)
	   						{
	   							flag++;
	   						}
   						}
   					}
   					if(flag==n-1)
   					{
   						ans.add(i);
   					}
   					flag=0;
   				}
   				if(ans.size()>0)
   				{
   					for(int i=0;i<ans.size();i++)
   					{
   						System.out.print(ans.get(i)+" ");
   					}
   				}
   				else
   				{
   					System.out.print(-1);
   				}
   			}
   		}
   	}
}