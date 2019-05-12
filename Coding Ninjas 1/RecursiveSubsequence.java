import java.util.Scanner;


public class RecursiveSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String n=s.nextLine();
		String ans[]=subsequence(n);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
	public static String[] subsequence(String input){
		if(input.length()==1)
		{
			String ans[]={input};
			return ans;
		}
		String smallResult[]=subsequence(input.substring(1));
		char letter=input.charAt(0);
		String ans[]=new String[smallResult.length*2+1];
		for(int i=0;i<smallResult.length;i++)
		{
			ans[i]=letter+smallResult[i];	
		}
		for(int j=smallResult.length;j<smallResult.length*2;j++)
		{
			ans[j]=smallResult[j-smallResult.length];
		}
		ans[smallResult.length*2]=String.valueOf(letter);
		return ans;
	}

}