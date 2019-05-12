import java.util.Scanner;


public class RecursionSumOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int val=sum(arr);
		System.out.print(val);
	}
	public static int sum(int input[]) {
		if( input.length==0)
		{
			return 0;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallArray[i-1]=input[i];
		}
		int ans=sum(smallArray);
		return ans+input[0];
	}

}
