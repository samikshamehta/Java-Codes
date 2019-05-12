import java.util.Scanner;
import java.util.Arrays;

public class PrintArrayIntersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n1=s.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
		}
		int n2=s.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=s.nextInt();
		}
		intersection(arr1,arr2);
	
	}
	public static void intersection(int[] arr1, int[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr1[i]);
				i++;
				j++;
			}
			else
			{
				if(arr1[i]<arr2[j])
				{
					i++;
				}
				else
				{
					j++;
				}
			}
		}
	}
}