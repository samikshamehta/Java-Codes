import java.util.Scanner;


public class SecondLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		// TODO Auto-generated method stub
		int secondmax=secondLargestElement(array);
		System.out.print(secondmax);
	}
	public static int secondLargestElement(int[] arr) {
		int i,j,k=0;
		int max=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				{
					max=arr[i];
					k=i;
				}
		}
		int max1=arr[0];
		for(j=1;j<k;j++)
		{
			if(arr[j]>max1)
			{
				max1=arr[j];
			}
		}
		int max2=arr[k+1];
		for(j=k+2;j<arr.length;j++)
		{
			if(arr[j]>max2)
			{
				max2=arr[j];
			}
		}
		if(max==max1)
		{
			return max2;
		}
		else
		{
			if(max==max2)
			{
				return max1;
			}
			else
			{
				if(max1>max2)
				{
					return max1;
				}
				else
				{
					return max2;
				}
			}
		}
	}
}

