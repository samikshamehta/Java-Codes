import java.util.Scanner;


public class RecursiveCountZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int ans= countZerosRec(n);
		System.out.println(ans);
	}
	public static int countZerosRec(int input){
		if(input==0)
		{
			return 0;
		}
		int ans=countZerosRec(input/10);
		if(input%10==0)
			{
				return ans+1;
			}
			else
			{
				return ans;
			}
	}
}
