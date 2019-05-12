import java.util.Scanner;


public class RotateArray {

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
		int d=s.nextInt();
		// TODO Auto-generated method stub
		rotate(array,d);
	}
	public static void rotate(int[] arr, int d) {
		int val[]=new int[d];
		int index=d,l=0,m;
		for(int i=0;i<d;i++)
		{
			val[i]=arr[i];
		}
		for(int j=0;j<arr.length-index;j++)
		{
			
			arr[j]=arr[d++];
		}
		for(int k=arr.length-index;k<arr.length;k++)
		{
			arr[k]=val[l++];
		}
		for(m=0;m<arr.length;m++)
		{
			System.out.print(arr[m]+ " ");
		}
	}
}
