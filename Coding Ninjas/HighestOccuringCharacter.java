import java.util.Scanner;


public class HighestOccuringCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		char ans=highestOccuringCharacter(input);
		System.out.print(ans);
	}
	public static char highestOccuringCharacter(String inputString) {
		int i,j,count=0,count1=0;
		char ans=inputString.charAt(0);
		for(i=0;i<inputString.length();i++)
		{
			for(j=0;j<inputString.length();j++)
			{
				if(inputString.charAt(j)==' ')
				{
					j++;
				}
				if(inputString.charAt(i)==inputString.charAt(j))
				{
					count1++;
				}
			}
			if(count<count1)
			{
				count=count1;
				ans=inputString.charAt(i);
			}
			count1=0;
		}
		return ans;
	}

	}