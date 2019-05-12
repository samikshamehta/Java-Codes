import java.util.Scanner;
import java.util.Arrays;

public class TripletSumNew {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		FindTriplet	(arr,x);
	}
	public static void FindTriplet(int[] arr, int x)
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==x)
					{
						System.out.println(arr[i]+ " "+arr[j]+ " "+arr[k]);
					}
				}
			}
		}
	}
}
					