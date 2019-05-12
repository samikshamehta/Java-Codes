import java.util.Scanner;


public class SwapAlternate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++)
		{
			input[i]=s.nextInt();
		}
		swapAlternate(input);
	}
	public static void swapAlternate(int[] input){
		int temp;
		for(int i=1;i<input.length;i=i+2)
		{
			temp=input[i];
			input[i]=input[i-1];
			input[i-1]=temp;
		}
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+ " ");
		}
}
}