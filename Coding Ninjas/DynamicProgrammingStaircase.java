import java.util.Scanner;
public class DynamicProgrammingStaircase 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		long ans=staircase(n);
		System.out.println(ans);
	}
	/*public static long staircase(int n)
	{
		long dyn[]=new long[n+1];
		long ans=Staircase(n,dyn);
		return ans;
	}
	public static long Staircase(int n,long dyn[])
	{
		if(n<=1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		if(dyn[n]>0)
		{
			return dyn[n];
		}
		dyn[n]=Staircase(n-1,dyn)+Staircase(n-2,dyn)+Staircase(n-3,dyn);
		return dyn[n];
	}*/
	public static long staircase(int n){
		if (n == 1 || n == 0) 
	            return 1;
	        else if (n == 2) 
	            return 2;
	          else
	            return staircase(n - 3) + staircase(n - 2) +staircase(n - 1);    

		}
		
	}
