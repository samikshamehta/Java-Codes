import java.util.Scanner;


public class ReplaceCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		String I=s.next();
		char c1=I.charAt(0);
		String II=s.next();
		char c2=II.charAt(0);
		String ans=replaceCharacter(input, c1, c2);
		System.out.print(ans);
	}
	public static String replaceCharacter(String input, char c1, char c2) {
		int i;
		String ans="";
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)==c1)
			{
				ans=ans+c2;
			}
			else
			{
				ans=ans+input.charAt(i);
			}
		}
		return ans;
	}
	
}