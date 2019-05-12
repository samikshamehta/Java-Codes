import java.util.Scanner;


public class RecursiveMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int ans=multiplyTwoIntegers(m,n);
		System.out.println(ans);
	}
	public static int multiplyTwoIntegers(int m, int n){
		if(n==0)
		{
			return 0;
		}
		int ans=multiplyTwoIntegers(m,n-1);
		return ans+m;
	}

}
