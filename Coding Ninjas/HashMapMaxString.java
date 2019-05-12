import java.util.*;

public class HashMapMaxString 
{ 
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		HashMap<String,Integer>hash=new HashMap<>();
		String str=s.nextLine();
		String array[]=str.split(" ");
		for(String word:array)
		{
			if(hash.containsKey(word))
			{
				hash.put(word, hash.get(word)+1);
			}
			else
			{
				hash.put(word,1);
			}
		}	
		System.out.print(hash.get("abc"));
	}
}
