import java.util.Scanner;
import java.util.Arrays;

public class CheckPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input1=s.nextLine();
		String input2=s.nextLine();
		boolean ans=isPermutation(input1,input2);
		System.out.print(ans);
	}
	public static boolean isPermutation(String input1, String input2) {
		char[] chars1 = input1.toCharArray();
		Arrays.sort(chars1);
		String newinput1 = new String(chars1);
		char[] chars2 = input2.toCharArray();
		Arrays.sort(chars2);
		String newinput2 = new String(chars2);
		for(int i=0;i<newinput1.length();i++)
		{
			if(newinput1.charAt(i)!=newinput2.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
}
