import java.util.Scanner;


public class RecursivePrintSubsetSumToK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		printSubsetsSumTok(arr,k);
	}
	public static void printSubsetsSumTok(int input[], int k) {
		int l=0,n=input.length-1;
		int A[]=new int[input.length];
		for(int i=0;i<input.length;i++)
		{
			A[i]=0;
		}
		PrintSubsetsSumToK(A,input,l,n,k);
}
	public static void PrintSubsetsSumToK(int A[],int input[],int l,int n,int k) {
		if(l==n)
		{
			A[l]=0;
			print(A,input,n,k);
			A[l]=1;
			print(A,input,n,k);
			return;
		}
		A[l]=0;
		PrintSubsetsSumToK(A,input,l+1,n,k);
		A[l]=1;
		PrintSubsetsSumToK(A,input,l+1,n,k);
	}
	public static void print(int A[],int input[],int n,int k) {
		int val=0,flag=0;
		for(int i=0;i<=n;i++)
		{
			if(A[i]==1)
			{
				val=val+input[i];
			}
		}
		if(val==k)
		{
			flag=1;
		}
		if(flag==1)
		{
			for(int i=0;i<=n;i++)
			{
				if(A[i]==1)
				{
					System.out.print(input[i]+" ");
				}
			}
			System.out.println();
		}
	}
}