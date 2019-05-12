import java.util.Scanner;


public class RecursiveCheckAB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String n=s.nextLine();
		boolean ans=checkAB(n);
		System.out.print(ans);
	
	}
	public static boolean checkAB(String input)
	{
		boolean ans=false;
		if(input.length()<=2 )
		{
			if(input.charAt(0)=='a' || input.charAt(0)=='b' && input.charAt(1)=='b')
			{
				return true;
			}
		}
		if(input.charAt(0)=='a')
		{
			if(input.charAt(1)==' ' || input.charAt(1)=='a' || input.charAt(1)=='b' && input.charAt(2)=='b')
			{
				ans=checkAB(input.substring(1));
			}
		}
		else
		{
			if(input.charAt(0)=='b' && input.charAt(1)=='b')
			{
				if(input.charAt(2)==' ' || input.charAt(2)=='a' )
				{
					ans=checkAB(input.substring(2));
				}
			}
			else
			{
				return false;
			}
		}
		return ans;
	}
}