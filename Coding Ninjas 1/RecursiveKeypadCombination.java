import java.util.Scanner;


public class RecursiveKeypadCombination {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		String ans[]=keypad(n);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
	public static String[] keypad(int n)
	{
		if(n==0)
		{
			String ans[]={""};
			return ans;
		}
		String smallAns[]=keypad(n/10);
		String code=getcode(n%10);
		String ans[]=new String[smallAns.length*code.length()];
		int k=0;
		for(int i=0;i<code.length();i++)
		{
			for(int j=0;j<smallAns.length;j++)
			{
				ans[k++]=smallAns[j]+code.charAt(i);
			}
		}
		return ans;
	}
	private static String getcode(int n)
	{
		String arr[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return arr[n];
	}
}
