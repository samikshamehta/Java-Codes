import java.util.Scanner;


public class SecondLargestInArray {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		int secondmax=secondLargestElement(array);
		System.out.print(secondmax);
	}
	static int secondLargestElement(int[]arr)
	{
		int i;
		int I=-120;
		int II=-120;
		for(i=0;i<arr.length;i++)
		{
			if(I<arr[i])
			{
				II=I;
				I=arr[i];
			}
			if(I>arr[i] && arr[i]>II)
			{
				II=arr[i];
			}
		}
		return II;
	}
}