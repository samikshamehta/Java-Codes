import java.util.Scanner;


public class RecursiveSumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int ans= sumOfDigits(n);
		System.out.println(ans);
	}
	public static int sumOfDigits(int input){
		if(input==0)
		{
			return 0;
		}
		int ans=sumOfDigits(input/10);
		if(input%10==0)
			{
				return ans;
			
			}
			else
			{
				return ans+(input%10);
			}
	}
}