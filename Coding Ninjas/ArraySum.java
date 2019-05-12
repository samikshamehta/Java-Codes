import java.util.Scanner;


public class ArraySum {

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
		int sum=sum(input);
		System.out.print(sum);
	}
	public static int sum(int[] input){
		int sum=0;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
		}
		return sum;
	}
	
	

}
