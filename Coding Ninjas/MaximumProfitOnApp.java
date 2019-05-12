import java.util.Scanner;
import java.util.Arrays;


public class MaximumProfitOnApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int budget[]=new int[n];
		for(int i=0;i<n;i++)
		{
			budget[i]=s.nextInt();
		}
		int result= maximumProfit(budget);
		System.out.println(result);
	}
	public static int maximumProfit(int budget[]) 
	{
			int max=0;
			int var=budget.length;
			Arrays.sort(budget);
			for(int i=0;i<budget.length;i++)
			{
				int temp=budget[i]*var;
				var--;
				if(temp>=max)
				{
					max=temp;
				}
			}

			return max;
	}
}
