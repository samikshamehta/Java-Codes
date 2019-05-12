import java.util.Scanner;


public class RecursionPrintSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String n=s.nextLine();
		printSubsequences(n);
		
	}
	public static void printSubsequences(String input) {
		String smallResult="";
		PrintSubsequences(input,smallResult);
}
	public static void PrintSubsequences(String input,String smallResult) {
		if(input.length()==0)
		{
			System.out.println(smallResult);
			return;
		}
		PrintSubsequences(input.substring(1),smallResult);
		PrintSubsequences(input.substring(1),smallResult+input.charAt(0));
	}

}