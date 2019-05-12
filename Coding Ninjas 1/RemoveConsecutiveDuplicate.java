import java.util.Scanner;


public class RemoveConsecutiveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		String ans=removeConsecutiveDuplicates(input);
		System.out.print(ans);
	}
	public static String removeConsecutiveDuplicates(String input) {
		int i;
		String ans=""+input.charAt(0);
		for(i=1;i<input.length();i++)
		{
			if(input.charAt(i)!=input.charAt(i-1))
			{
				ans=ans+input.charAt(i);
			}
		}
		return ans;
	}
	
}
