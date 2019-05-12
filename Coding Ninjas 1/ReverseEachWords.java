import java.util.Scanner;


public class ReverseEachWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String ans=reverseEachWord(str);
		System.out.print(ans);
	}
	public static String reverseEachWord(String input) {
		int i,j,start=0,end=0;
		input = input+" ";
		String ans="";
		for(j=0;j<input.length();j++)
		{ 
			if(input.charAt(j)==' ')
			{  end=j-1;
				for(i=end;i>=start;i--)
				{
					ans=ans+input.charAt(i);
				}
				ans=ans+' ';
				start=j;
			}
		}
		return ans;
	}
}


