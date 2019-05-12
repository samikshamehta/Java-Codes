import java.util.Scanner;


public class RecursiveReplacePi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String c= replace(str);
		System.out.println(c);
	}
	public static String replace(String input){
		if(input.length()<2)
		{
			return input;
		}
		if (input.charAt(0) == 'p' && input.charAt(1) == 'i') 
		 {
			 return "3.14" + replace(input.substring(2));
			  
		 }
		 return input.charAt(0) + replace(input.substring(1));
	}
}