import java.util.Scanner;


public class RecursivePrintAllCodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String n=s.nextLine();
		getCode(n);
	}
	public static  void getCode(String input)
	{
		String ans="";
		GetCode(input,ans);
	}
	public static void GetCode(String str,String ans) 
	{
		if (str.length() == 0) 
		{
			System.out.println(ans);
			return;
		}
       char ch = str.charAt(0);
       char code = (char) (ch - '1' + 'a');
       GetCode(str.substring(1), ans + code);
       if (str.length() >= 2)
       {
    	   int i = Integer.parseInt(str.substring(0, 2));
		   if (i > 0 && i <= 26) 
		   {
			   code = (char) (i + 'a' - 1);
			   GetCode(str.substring(2), ans + code);
		   }
       }
	}
}