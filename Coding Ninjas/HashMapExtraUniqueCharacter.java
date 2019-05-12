import java.util.HashMap;
import java.util.Scanner;


public class HashMapExtraUniqueCharacter {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		String result=uniqueChar(str);
		System.out.println(result);
	}
	public static String uniqueChar(String str)
	{
		HashMap<Character,Integer>hash=new HashMap<>();
		char array[]=str.toCharArray();
		String result="";
		for(char ch:array)
		{
			if(hash.containsKey(ch))
			{
				hash.put(ch, hash.get(ch)+1);
			}
			else
			{
				hash.put(ch,1);
				result=result+ch;
			}
		}
		return result;
	}
}
