import java.util.Scanner;


public class TestClassReverseSumInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int first=s.nextInt();
			int second=s.nextInt();
			int revfirst=reverse(first);
			int revsecond=reverse(second);
			int sum=revfirst+revsecond;
			int result=reverse(sum);
			System.out.println(result);
		}
	}
	public static int reverse(int val)
	{
		int reversenumber=0;
		while(val>0)
		{
			int last=val%10;
			val=val/10;
			reversenumber=reversenumber*10+last;
		}
		return reversenumber;
	}

}
