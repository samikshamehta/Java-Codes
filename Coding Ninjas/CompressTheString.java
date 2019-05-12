import java.util.Scanner;


public class CompressTheString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		String ans=compress(input);
		System.out.print(ans);
	}
	public static String compress(String inputString) {
		int i,j,count=0;
		String ans="";
		for(i=0;i<inputString.length();i++)
		{
			for(j=i;j<inputString.length();j++)
			{
				if(inputString.charAt(i)!=inputString.charAt(j))
				{
					break;
				}
				else
				{
					count++;
					i=j;
				}
			}
			ans=ans+inputString.charAt(i);
			if(count!=1)
			{
				ans=ans+String.valueOf(count);
			}
			count=0;
		}
		return ans;
	}

	}