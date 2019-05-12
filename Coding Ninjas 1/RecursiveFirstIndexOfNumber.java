import java.util.Scanner;


public class RecursiveFirstIndexOfNumber {

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
		int x=s.nextInt();
		int ans=firstIndex(arr,x);
		System.out.println(ans);
	}
	public static int firstIndex(int input[], int x) {
		if(input.length==0)
		{
			return -1;
		}
		if(input[0]==x)
		{
			return 0;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallArray[i-1]=input[i];
		}
		int ans= firstIndex(smallArray,x);
		if(ans==-1)
		{
			return -1;
		}
		else
		{
		return ans+1;
		}
	}
}