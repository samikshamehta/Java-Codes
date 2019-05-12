import java.util.Scanner;


public class QuickSort {

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
		quickSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");

		}
	}
	public static void quickSort(int[] input){
		int start=0,end=input.length-1;
		QuickSort(input,start,end);
	}
	public static void QuickSort(int[] input,int start,int end){
		if(start>end)
		{
			return;
		}
		int pivotIndex=getPivotElement(input,start,end);
		QuickSort(input,start,pivotIndex-1);
		QuickSort(input,pivotIndex+1,end);

	}
	public static int getPivotElement(int[]input,int start,int end){
		int pivotElement = input[end];
		int pivotIndex = start;
		for(int i =start;i<end;i++)
		{
			if(input[i]<=pivotElement)
			{
				int temp=input[i];
				input[i]=input[pivotIndex];
				input[pivotIndex]=temp;
				pivotIndex++;
			}
			
		 }
		int val=input[end];
		input[end]=input[pivotIndex];
		input[pivotIndex]=val;
		return pivotIndex;
	}
}