import java.util.Scanner;


public class MixedProblemIncreasingNumber {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		printIncreasingNumber(n);
	}
	public static void printIncreasingNumber(int n) 
	{
		String output="";
		PrintIncreasingNumber(1,output,n);
	}
	public static void PrintIncreasingNumber(int start,String output,int n) 
	{
		if(n==0)
		{
			System.out.print(output+" ");
			return;
		}
		for(int i=start;i<=9;i++)
		{
			String str=output+String.valueOf(i);
			PrintIncreasingNumber(i+1,str,n-1);
		}
	}


}
