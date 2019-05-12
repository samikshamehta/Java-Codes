import java.util.Scanner;


public class RecursionMinInArray {

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
		int ans=min1(arr,1);
		System.out.println(ans);
	}
	public static int min(int arr[],int index,int min)
	{ 
		if(arr.length==index)
		{
			return min;
		}
		if(arr[index]<min)
		{
			min=arr[index];
		}
		return min(arr,index+1,min);
	}
	public static int min1(int arr[],int index)
	{   int min;
		if(arr.length==index)
		{
			return arr[index-1];
		}
		if(arr[index-1]<arr[index])
		{
			min=arr[index];
			arr[index]=arr[index-1];
			arr[index-1]=min;
		}
		return min1(arr,index+1);
	}
}
