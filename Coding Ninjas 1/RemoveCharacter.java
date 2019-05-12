import java.util.Scanner;


public class RemoveCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		String I=s.next();
		char c1=I.charAt(0);
		String ans=removeAllOccurrencesOfChar(input, c1);
		System.out.print(ans);
	}
	public static String removeAllOccurrencesOfChar(String input, char c) {
		int i;
		String ans="";
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=c)
			{
				ans=ans+input.charAt(i);
			}
		}
		return ans;
	}
	
}
