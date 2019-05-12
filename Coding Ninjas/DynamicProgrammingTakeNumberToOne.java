import java.util.Scanner;


public class DynamicProgrammingTakeNumberToOne {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int ans=countStepsTo1(n);
		System.out.println(ans);
	}
	public static int countStepsTo1(int n)
	{
		int dyn[]=new int[n+1];	
		dyn[0]=0;
		dyn[1]=0;
		for(int i=2;i<=n;i++)
		{
			int r=1+dyn[i-1];
			if(i%2==0)
			{
				r=Math.min(r,1+dyn[i/2]);
			}
			if(i%3==0)
			{
				r=Math.min(r, 1+dyn[i/3]);
			}
			dyn[i]=r;
		}
		return dyn[n];
	}		
}

