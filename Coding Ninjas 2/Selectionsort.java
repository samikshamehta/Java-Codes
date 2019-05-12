import java.util.Scanner;


public class selectionsort {

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
		selectionSort(arr);
		
	}
	public static void selectionSort(int[] arr)
	{
		int i,minelementindex,temp;
		for(i=0;i<arr.length;i++)
		{
			minelementindex=getElementIndex(arr,i);
			temp=arr[i];
			arr[i]=arr[minelementindex];
			arr[minelementindex]=temp;
		}
		for(i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+ " ");
		}
	}
	public static int getElementIndex(int[] arr,int i)
	{
		int j,min=arr[i],k=i;
		for(j=i+1;j<arr.length;j++)
		{
			if(min>arr[j])
			{
				min=arr[j];
				k=j;

			}
		}
		return k;
	}
}
