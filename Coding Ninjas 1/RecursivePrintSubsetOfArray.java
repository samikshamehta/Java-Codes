import java.util.Scanner;
public class RecursivePrintSubsetOfArray {

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
		printSubsets(arr);
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
	public static void print(int A[],int input[],int n) {
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