import java.util.Scanner;


public class RecursiveRemoveX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String c= removeX(str);
		System.out.println(c);
	}
	public static String removeX(String input){
		if(input.length()<1)
		{
			return input;
		}
		if (input.charAt(0) == 'x') 
		 {
			 return removeX(input.substring(1));
			  
		 }
		 return input.charAt(0) + removeX(input.substring(1));
	}
}