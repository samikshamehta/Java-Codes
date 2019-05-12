import java.util.Scanner;


public class RecursiveMergeSort {

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
		mergeSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void mergeSort(int[] input) {
		if (input.length == 1) 
		{
			return;
		}

		int[] leftArray = new int[input.length / 2];
		int[] rightArray = new int[input.length - leftArray.length];
		for (int i = 0; i < input.length; i++)
		{
			if(i<input.length/2)
			{
				leftArray[i] = input[i];

			}
			else
			{
				rightArray[i-leftArray.length] = input[i];
		
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray,input);
		
	}

	public static void merge(int[] arr1, int[] arr2,int input[]) 
	{
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length)
		{
			if (arr1[i] < arr2[j]) 
			{
				input[k++] = arr1[i++];
			} else
			{
				input[k++] = arr2[j++];
			}
		}
		while (i < arr1.length)
		{
			input[k++] = arr1[i++];
		}
		while (j < arr2.length)
		{
			input[k++] = arr2[j++];
		}
	}
}