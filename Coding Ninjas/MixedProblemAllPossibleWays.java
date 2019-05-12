import java.util.Scanner;


public class MixedProblemAllPossibleWays 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(allWays(x, n));
    }
	public static int allWays(int x, int n)
	{
		int ans=AllWays(x,x,0,n);
		return ans;
	}
	static int res = 0;
	public static int AllWays(int num,int x,int k,int n)
	{
		if (x == 0)
		{
            res++;
		}
        int r = (int)Math.floor(Math.pow(num, 1.0 / n));
        for (int i = k + 1; i <= r; i++)
        {
            int a = x - (int)Math.pow(i, n);
            if (a >= 0)
            {
        	  AllWays(num,a, i, n);
            }
        }
        return res;
    }
}