import java.util.Scanner;


public class MinimumLengthWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String ans=minLengthWord(str);
		System.out.print(ans);
	}
	public static String minLengthWord(String input){
		int i,j,start=0,end=0,count1=120,count2=0,startindex=0;
		input = input+" ";
		String ans="";
		for(j=0;j<input.length();j++)
		{ 
			if(input.charAt(j)==' ')
			{ 
				for(i=start;i<=j-1;i++)
				{
					count2++;

				}
				if(count1>count2)
				{
					count1=count2;
					startindex=start;
					end=j;

				}
				start=j+1;
				count2=0;
				
			}
		}
		for(int k=startindex;k<end;k++)
		{
			ans=ans+input.charAt(k);
		}
		return ans;
	}
}
