import java.util.Scanner;


public class RecursiveReplaceCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		char c1=s.nextLine().charAt(0);
		char c2=s.nextLine().charAt(0);
		String c= replaceCharacter(str,c1,c2);
		System.out.println(c);
	}
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length()<1)
		{
			return input;			
		}
		if(input.charAt(0)==c1)
		{
			return c2+replaceCharacter(input.substring(1),c1, c2);
		}
		return input.charAt(0)+replaceCharacter(input.substring(1),c1, c2);
	}
}
