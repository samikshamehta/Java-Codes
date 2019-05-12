import java.util.Scanner;


public class RecursionSearch7 {

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
		boolean ans=search(arr,0);
		System.out.println(ans);
	}
	public static boolean search(int arr[], int index)
	{   if(arr.length==index)
		{
			return false;
		}
		if(arr[index]==7)
		{
			return true;
		}
		return search(arr,index+1);
		
	}
}