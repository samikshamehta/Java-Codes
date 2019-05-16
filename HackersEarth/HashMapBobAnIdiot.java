import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapBobAnIdiot 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Character>A=new ArrayList<>();
		ArrayList<Character>B=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String a=s.next();
			A.add(a.charAt(0));
			String b=s.next();
			B.add(b.charAt(0));
		}
		String line=s.next();
		HashMap<Character,Integer>hash=new HashMap<>();
		for(int j=0;j<line.length();j++)
		{
			if(hash.containsKey(line.charAt(j)))
			{
				hash.put(line.charAt(j),hash.get(line.charAt(j))+1);
			}
			else
			{
				hash.put(line.charAt(j),1);
			}                         
		}
		for(int i=0;i<n;i++)
		{
			if(hash.containsKey(A.get(i))&& hash.containsKey(B.get(0)))
			{
				line=line.replaceFirst(String.valueOf(B.get(i)), String.valueOf(A.get(i)));
				line=line.replaceFirst(String.valueOf(A.get(i)), String.valueOf(B.get(i)));
			}
		}
			
		System.out.println(line);
	}	
}