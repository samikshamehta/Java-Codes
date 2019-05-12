import java.util.Arrays;
import java.util.Scanner;


public class RecursivePalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		boolean c= isStringPalindrome(str);
		System.out.println(c);
	}
	public static boolean isStringPalindrome(String input) {
		if(input.length()<=1)
		{
			return true;
		}
		if(input.charAt(0)!=input.charAt(input.length()-1))
		{
			return false;
		}
		boolean ans= isStringPalindrome(input.substring(1, input.length() - 1));
		return ans;
	}
}
