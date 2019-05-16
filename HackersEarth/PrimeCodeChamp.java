import java.util.Scanner;
public class PrimeCodeChamp {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		int k=s.nextInt();
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int result=calculate(k,a);
		System.out.println(result);
	}
	public static int calculate(int k,int a[])
	{
		int d=0,result=0;
		for(int i=1;i<a.length;i++)
		{
			result=result+(k-(a[d]+a[i]));
			/*if(result>=sum)
			{
				result=sum;
			}*/
			d++;
		}
		return result/d;
	}
}
