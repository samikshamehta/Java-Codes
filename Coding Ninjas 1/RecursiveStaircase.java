import java.util.Scanner;


public class RecursiveStaircase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int ans=findWays(n);
		System.out.println(ans);
	}
	public static int findWays(int n){
		if(n==0 || n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		return findWays(n-1)+findWays(n-2)+findWays(n-3);
	}
}
