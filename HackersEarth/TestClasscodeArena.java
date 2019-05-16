
import java.util.Scanner;


public class TestClasscodeArena
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		double product=1;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			product=(product*arr[i])%1000000007;
		}
		double gcd=findGCD(arr);
		int ans=(int) Math.pow(product, gcd);
		System.out.print(ans%1000000007);
		
	}
	public static double findGCD(int arr[])
    {
        int result = arr[0];
        for (int i=1; i<arr.length; i++)
        {
            result = gcd(arr[i], result);
        }
        return result;
    }
	public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }
}
	