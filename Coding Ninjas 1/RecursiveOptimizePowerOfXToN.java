import java.util.Scanner;


public class RecursiveOptimizePowerOfXToN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int r=XPowerN(x, n);
	}
	public static int XPowerN(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int smallAns=XPowerN(x,n/2);
		if(n%2==0)
		{
			return smallAns*smallAns;
		}
		else
		{
			return x* smallAns*smallAns;

		}
	}

}
