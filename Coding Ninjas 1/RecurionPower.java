import java.util.Scanner;


public class RecurionPower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int ans=power(x,n);
		System.out.print(ans);
	}
	public static int power(int x, int n) {
		if(n==0)
		{
			return 1;
		}
		int ans=power(x,n-1);
		return ans*x;
	}
}
