import java.util.Scanner;


public class CheckArrayRotation {

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
		int val=arrayRotateCheck(arr);
		System.out.println(val);
	}
	public static int arrayRotateCheck(int[] arr){
		int min=arr[0],k=0;
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				k=i;
			}
		}
		return k;
	}
}