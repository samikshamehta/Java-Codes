import java.util.Scanner;


public class RecursionSumOFNInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int ans=sum(n);
		System.out.print(ans);
	}
	public static int sum(int n) {
		if(n==0)
		{
			return 0;
		}
		int ans=sum(n-1);
		return n+ans;
		}
}
