import java.util.Scanner;
public class BasicProgrammingAnagrams {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			String s1=s.next();
			String s2=s.next();
			int count1[]=new int[26];
			int count2[]=new int[26];
			for(int j=0;j<s1.length();j++)
			{
				count1[s1.charAt(j)-'a']++;
			}
			for(int j=0;j<s2.length();j++)
			{
				count2[s2.charAt(j)-'a']++;
			}
			int result=0;
			for(int j=0;j<26;j++)
			{
				result+=Math.abs(count1[j]-count2[j]);
			}
			System.out.println(result);
		}
	}
}
