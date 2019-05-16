import java.util.Scanner;
public class KiljeeandMagicValue 
{
	private static Scanner s = new Scanner(System.in);
	static long fib[]=new long[2000000];
	static long fact[]=new long[2000000];
	public static void main(String args[] ) throws Exception
	{
		try
		{
			int t=s.nextInt();
			fib[0]=1;
			fib[1]=1;
			fact[0]=0;
			fact[1]=1;
			for(int i=0;i<t;i++)
			{
				int N=s.nextInt();
				int M=s.nextInt();
				int K=s.nextInt();
				long P=0;
				for(int j=N;j<=M;j++)
				{
					if(fib[j]!=0 && fact[j]!=0)
					{
						P=(P+(fib[j]*fact[j]))%1000000007;
					}
					else
					{
						fib[j]=fibonnic(j);
						fact[j]=j*fact(j-1);
						P=(P+(fib[j]*fact[j]))%1000000007;
					}
				}
				long result=(P/K)%1000000007;
				System.out.println(result);
			}
		}
		catch(Exception e)
		{
			
		}
	}
	public static long fibonnic(int N)
	{
		for(int i=2;i<=N;i++)
		{
			if(fib[i]==0)
			{
				fib[i] = fib[i-1] + fib[i-2];
			}
		}
		return fib[N];
	}
	public static long fact(int N)
	{
		for(int i=2;i<=N;i++)
		{
			if(fact[i]==0)
			{
				fact[i]=i*fact[i-1];
			}
		}
		return fact[N];
	}
}
