import java.util.HashMap;
import java.util.Scanner;


public class HashMapMaximumOccurence {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		highestOccuringCharacter(input);
	}
	public static void highestOccuringCharacter(String inputString)
	{
		HashMap<Character,Integer>hash=new HashMap<>();
		int i,count=0;
		char ans = 0;
		for(i=0;i<inputString.length();i++)
		{
			if(hash.containsKey(inputString.charAt(i)))
			{
				hash.put(inputString.charAt(i), hash.get(inputString.charAt(i))+1);
				if(count<hash.get(inputString.charAt(i)))
				{
					count=hash.get(inputString.charAt(i));
					ans=inputString.charAt(i);
				}
			}
			else
			{
				hash.put(inputString.charAt(i),1);
				if(count<hash.get(inputString.charAt(i)))
				{
					count=hash.get(inputString.charAt(i));
					ans=inputString.charAt(i);
				}
			}
		}
		System.out.println(ans+" "+count);
	}
}
