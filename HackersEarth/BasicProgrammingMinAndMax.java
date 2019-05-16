import java.util.Scanner;
import java.util.Arrays;

public class BasicProgrammingMinAndMax 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		Arrays.sort(array);
		String ans=MinMax(array);
		System.out.println(ans);
	}
	public static String MinMax(int array[])
	{
		for(int i=1;i<array.length;i++)
		{
			if(array[i-1]+1==array[i]||array[i-1]==array[i])
			{
				continue;
			}
			else
			{
				return "NO";
			}
		}
		return "YES";
	}
}