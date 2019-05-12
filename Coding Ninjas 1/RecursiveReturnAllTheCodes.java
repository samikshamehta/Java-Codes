import java.util.Scanner;


public class RecursiveReturnAllTheCodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		String[] outputs=getCode(input);
		for(String output:outputs)
		{
			System.out.println(output);
		}
		
	}
	public static String[] getCode(String input) 
	{
		String ans="";
		String result=GetCode(input,ans);
		String[] words=result.split(",");
		return words;
	}
	public static String GetCode(String input,String ans) 
	{
		if (input.length() == 0) 
		{
			return ans;
		}
       char ch = input.charAt(0);
       char code = (char) (ch - '1' + 'a');
       String op=GetCode(input.substring(1), ans + code);
       if (input.length() >= 2)
       {
    	   int i = Integer.parseInt(input.substring(0, 2));
		   if (i > 0 && i <= 26)
		   {
			   code = (char) (i + 'a' - 1);
			   String op1=GetCode(input.substring(2), ans + code);
				   op=op+","+op1;
		   }
       }
       return op;
	}
}