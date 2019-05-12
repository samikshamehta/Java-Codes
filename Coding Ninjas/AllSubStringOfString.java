import java.util.Scanner;


public class AllSubStringOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		printSubstrings(str);
	}
	public static void printSubstrings(String str){
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=str.length();j>i;j--)
			{
				ans=str.substring(i,j);
				System.out.println(ans);
			}
		}
	}

}
