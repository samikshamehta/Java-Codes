import java.util.Scanner;


public class DuplicateInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++)
		{
			input[i]=s.nextInt();
		}
		int val=duplicate(input);
		System.out.println(val);
	}
	public static int duplicate(int[] arr){
		int i,sum=0,arraysum=0;
		int n=arr.length-1;
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		arraysum=(n*(n-1))/2;
		int val=sum-arraysum;
		return val;
		}
}