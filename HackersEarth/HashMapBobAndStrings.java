import java.util.HashMap;
import java.util.Scanner;


public class HashMapBobAndStrings
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			String S=s.next();
			String T=s.next();
			HashMap<Character,Integer>hash=new HashMap<>();
			for(int j=0;j<S.length();j++)
			{
				if(hash.containsKey(S.charAt(j)))
				{
					hash.put(S.charAt(j),hash.get(S.charAt(j))+1);
				}
				else
				{
					hash.put(S.charAt(j),1);
				}                         
			}
			int value=Math.abs(S.length()-T.length());
			int count=0;
			for(int j=0;j<T.length();j++)
			{
				if(hash.containsKey(T.charAt(j)) && hash.get(T.charAt(j))!=0)
				{
					hash.put(T.charAt(j),hash.get(T.charAt(j))-1);
				}
				else
				{
					count=count+2;
				}
			}
			if(S.length()>T.length())
			{
				System.out.println((count+value));
			}
			else
			{
				System.out.println((count+value)-(value*2));
			}
		}
		
	}	
}
