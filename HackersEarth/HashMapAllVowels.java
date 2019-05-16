import java.util.HashMap;
import java.util.Scanner;

public class HashMapAllVowels 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		HashMap<Character,Integer>hash=new HashMap<>();
		int flag=0;
		char vowels[]={'a','e','i','o','u'};
		int n=s.nextInt();
		String str=s.next();
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=str.charAt(i);
			if(hash.containsKey(arr[i]))
			{
				hash.put(arr[i], hash.get(arr[i])+1);
			}
			else
			{
				hash.put(arr[i],1);
			}
		}
		for(int i=0;i<vowels.length;i++)
		{
			if(hash.containsKey(vowels[i]))
			{
				flag=1;
			}
			else
			{
				flag=0;
				System.out.println("NO");
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("YES");
		}
	}
}
