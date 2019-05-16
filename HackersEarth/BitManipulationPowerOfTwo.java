import java.util.ArrayList;
import java.util.Scanner;


public class BitManipulationPowerOfTwo {
	static int flag=0;
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			flag=0;
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=s.nextInt();
			}
			printSubsets(arr);
			if(flag==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
		public static void printSubsets(int input[]) {
			int k=0,n=input.length-1;
			int A[]=new int[input.length];
			for(int i=0;i<input.length;i++)
			{
				A[i]=0;
			}
			PrintSubsets(A,input,k,n);
	}
		public static void PrintSubsets(int A[],int input[],int k,int n) {
			if(k==n)
			{
				A[k]=0;
				print(A,input,n);
				A[k]=1;
				print(A,input,n);
				return;
			}
			A[k]=0;
			PrintSubsets(A,input,k+1,n);
			A[k]=1;
			PrintSubsets(A,input,k+1,n);
		}
		public static void print(int A[],int input[],int n) 
		{
			ArrayList<Integer>arr=new ArrayList<>();
			for(int i=0;i<=n;i++)
			{
				if(A[i]==1)
				{
					arr.add(input[i]);
				}
			}
			if(arr.size()>1)
			{
				int c=0;
				for(int j=1;j<arr.size();j++)
				{
					if(j==1)
					{
						c=arr.get(j-1)&arr.get(j);
					}
					else
					{
						c=c&arr.get(j);
					}
				}
				if(c!=0)
				{
					if(c%2==0)
					{
						flag=1;
					}
				}
			}
		}
	}
	