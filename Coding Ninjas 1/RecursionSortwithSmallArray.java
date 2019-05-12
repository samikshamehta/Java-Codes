import java.util.Scanner;


public class RecursionSortwithSmallArray {

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
		boolean ans=sort(arr);
		System.out.println(ans);
	}
	public static boolean sort(int arr[])
	{   if(arr.length==1 || arr.length==0)
		{
			return true;
		}
		if(arr[0]>=arr[1])
		{
			return false;
		}
		int smallArray[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++)
			
		{
			smallArray[i-1]=arr[i];
		}
		return sort(smallArray);
	}
}