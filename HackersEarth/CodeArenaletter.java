import java.awt.List;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CodeArenaletter {
	public static void main(String[] args)throws Exception
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int l=0;l<n;l++)
		{
			String name=s.next();
			HashMap<Character,Integer>hash=new HashMap<Character,Integer>();
			for(int i=0;i<name.length();i++)
			{
				if(hash.containsKey(name.charAt(i)))
				{
					hash.put(name.charAt(i),hash.get(name.charAt(i))+1);
				}
				else
				{
					hash.put(name.charAt(i),1);
				}
			}
			for(int i=122;i>=97;i--)
			{
				char val=(char)i;
				if(!hash.containsKey(val))
				{
					System.out.print(val+" ");
				}
			}
	     	ValueComparator bvc = new ValueComparator(hash);
			TreeMap<Character, Integer>sorted = new TreeMap<Character, Integer>(bvc);
			sorted.putAll(hash);
			for(Character value:sorted.keySet())
			{
				 System.out.print(value+" ");
			}
			System.out.println();
	 	}
		
	}
}
class ValueComparator implements Comparator<Character> 
{
	HashMap<Character, Integer> base;

    public ValueComparator(HashMap<Character, Integer> base) 
    {
        this.base = base;
    }
    public int compare(Character a, Character b) {
        if (base.get(a) <= base.get(b)&& b.compareTo(a)<=0) {
            return -1;
        } else {
            return 1;
        } 
    }
}
