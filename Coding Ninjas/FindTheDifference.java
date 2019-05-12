import java.util.Scanner;


public class FindTheDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args){
	
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int input[]=new int[n];
	for(int i=0;i<n;i++)
	{
		input[i]=s.nextInt();
	}
	int difference=findDifference(input);
	System.out.print(difference);
}
	public static int findDifference(int[] input){

		int even=0,odd=0,difference=0;
		for(int i=0;i<input.length;i=i+2)
		{
			even=even+input[i];
		}
		for(int i=1;i<input.length;i=i+2)
		{
			odd=odd+input[i];
		}
		difference=even-odd;
		return difference;
	}

}
