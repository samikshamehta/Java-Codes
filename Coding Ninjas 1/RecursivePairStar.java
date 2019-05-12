import java.util.Scanner;


public class RecursivePairStar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String c= addStars(str);
		System.out.println(c);
	}
	public static String addStars(String s) {
		if(s.length()<=1)
		{
			return s;
		}
		if(s.charAt(0)==s.charAt(1))
		{
			 return s.charAt(0)+"*"+ addStars(s.substring(1));
			  
		 }
		 return s.charAt(0) + addStars(s.substring(1));
	}
}
