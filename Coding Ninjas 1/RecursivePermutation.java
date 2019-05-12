import java.util.Scanner;
public class RecursivePermutation
{	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String n=s.nextLine();
		permutations(n);
	}
	public static void permutations(String input)
	{
		String smallResult="";
		Permutations(input,smallResult);
	}
	public static void Permutations(String input,String smallResult) 
	{
		if(input.length()==0)
		{
			System.out.println(smallResult);
			return;
		}
		for(int i=0;i<input.length();i++)
		{
			String newinput=input.substring(0,i)+input.substring(i+1);
			String newsmallResult=smallResult+input.charAt(i);
			Permutations(newinput,newsmallResult);
		}
	}
}
