import java.util.ArrayList;
import java.util.Scanner;


public class HighestAvgNissan {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int q=s.nextInt();
		for(int i=0;i<q;i++)
		{
			int k=s.nextInt();
			printSubsets(arr,k);
			if(max!=Integer.MIN_VALUE)
			{
				System.out.println(max);
			}
			else
			{
				System.out.println(0);
			}
			max=Integer.MIN_VALUE;
		}
	}
	public static void printSubsets(int input[],int val) {
		int k=0,n=input.length-1;
		int A[]=new int[input.length];
		for(int i=0;i<input.length;i++)
		{
			A[i]=0;
		}
		PrintSubsets(A,input,k,n,val);
}
	public static void PrintSubsets(int A[],int input[],int k,int n,int val) {
		if(k==n)
		{
			A[k]=0;
			print(A,input,n,val);
			A[k]=1;
			print(A,input,n,val);
			return;
		}
		A[k]=0;
		PrintSubsets(A,input,k+1,n,val);
		A[k]=1;
		PrintSubsets(A,input,k+1,n,val);
	}
	static int max=Integer.MIN_VALUE;
	public static void print(int A[],int input[],int n,int val) 
	{
		int sum=0,count=0;
		for(int i=0;i<=n;i++)
		{
			if(A[i]==1)
			{
				sum+=input[i];
				count++;
			}
		}
		if(sum!=0 && count!=0)
		{
			if((sum/count)<val)
			{
				if(max<count)
				{
					max=count;
				}
			}
		}
	}
}
