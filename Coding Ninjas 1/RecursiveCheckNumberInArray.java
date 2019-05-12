import java.util.Scanner;


public class RecursiveCheckNumberInArray {

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
		boolean ans=checkNumber(arr,x);
		System.out.println(ans);
	}
	public static boolean checkNumber(int input[], int x) {
	   if(input.length==0)
		{
			return false;
		}
		if(input[0]==x)
		{
			return true;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallArray[i-1]=input[i];
		}
		return checkNumber(smallArray,x);
	}
}