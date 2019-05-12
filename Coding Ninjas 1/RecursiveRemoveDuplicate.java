import java.util.Scanner;


public class RecursiveRemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String c= removeConsecutiveDuplicates(str);
		System.out.println(c);
	}
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()<=1)
		{
			return s;
		}
		if(s.charAt(0)==s.charAt(1))
		{
			return removeConsecutiveDuplicates(s.substring(1));
		}
		return s.substring(0,1) + removeConsecutiveDuplicates(s.substring(1));
	}
}