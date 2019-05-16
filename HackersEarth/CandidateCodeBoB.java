import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class CandidateCodeBoB {
	public static void main(String args[] ) throws Exception
   	{
   		Scanner s = new Scanner(System.in);
   		int n=s.nextInt();
   		ArrayList<Integer> len=new ArrayList<Integer>();
   		ArrayList<Integer> start=new ArrayList<Integer>();
   		int maxtime=0;
   		for(int i=0;i<n;i++)
   		{
   			len.add(i,s.nextInt());
   		}
   		for(int i=0;i<n;i++)
   		{
   			start.add(s.nextInt());
   			if(start.get(i)+len.get(i)>maxtime)
   			{
   				maxtime=start.get(i)+len.get(i);
   			}
   		}
   		HashMap<Integer,ArrayList<Integer>> hash=new HashMap<Integer,ArrayList<Integer>>();
   		int fish=1;
   		for(int i=0;i<n;i++)
   		{
   			for(int j=start.get(i);j<=(start.get(i)+len.get(i));j++)
   			{
   				ArrayList<Integer> ans=new ArrayList<Integer>();
   				if(!hash.containsKey(j))
   				{
   					ans.add(fish);
   					hash.put(j,ans);
   				}
   				else
   				{
   					ans=hash.get(j);
   					ans.add(ans.size(),fish);
	   				hash.put(j,ans);		
   				}
   			}
   			fish++;
   		}
   		int count=0;
   		HashMap<Integer,ArrayList<Integer>> has=new HashMap<Integer,ArrayList<Integer>>();
   		ArrayList<Integer> key=new ArrayList<Integer>();
   		for(Integer i:hash.keySet())
   		{
   			if(hash.containsKey(i))
   			{
   				if(has.isEmpty())
   				{
	   				has.put(i,hash.get(i));
	   				if(has.get(i).size()>count)
		   			{
		   				count=has.get(i).size();
		   				key.clear();
		   				key.add(i);
		   			}
		   			else
		   			{
		   				if(has.get(i).size()==count)
		   				{
		   					count=has.get(i).size();
		   					key.add(i);
		   				}
		   			}
   				}
   				else
   				{
   					int size=0;
   					for(Integer j:has.keySet())
   					{
   						if(!has.get(j).equals(hash.get(i)) && size==has.size()-1 )
   						{
   							has.put(i,hash.get(i));
   							if(has.get(i).size()>count)
   		   		   			{
   		   		   				count=has.get(i).size();
   		   		   				key.clear();
   		   		   				key.add(i);
   		   		   			}
   		   		   			else
   		   		   			{
   		   		   				if(has.get(i).size()==count)
   		   		   				{
   		   		   					count=has.get(i).size();
   		   		   					key.add(i);
   		   		   				}
   		   		   			}
   						}
   						size++;
   					}
   				}
   			}
   		}
   		hash.clear();
   		if(key.size()>1)
   		{
	   		int maxval=0;
	   		if(has.size()>1)
	   		{
		   		for(Integer i:has.keySet())
		   		{
		   			ArrayList<Integer>arr1=has.get(i);
		   			if(has.containsKey(i))
		   			{
		   				for(Integer j:has.keySet())
		   				{
		   					if(i!=j)
		   					{
			   					if(has.containsKey(j))
			   					{
				   		   			ArrayList<Integer>arr2=has.get(j);
				   		   			ArrayList<Integer>union=new ArrayList<>(arr1);
				   		   			union.addAll(arr2);
				   		   			ArrayList<Integer>intersection=new ArrayList<>(arr1);
				   		   			intersection.retainAll(arr2);
				   		   			union.removeAll(intersection);
				   		   			if(maxval<union.size()+intersection.size())
				   		   			{
				   		   				maxval=union.size()+intersection.size();
				   		   			}
			   					}
		   					}
		   				}
		   				if(maxval==n)
				   		{
				   			break;
				   		}
		   			}
		   		}
	   		}
	   		else
	   		{
	   			for(Integer i:hash.keySet())
		   		{
	   				if(hash.containsKey(i))
	   				{
		   				if(maxval<hash.get(i).size())
		   				{
		   					maxval=hash.get(i).size();
		   				}
	   				}
		   		}
	   		}
	   		count=0;
	   		count=maxval;
   		}
   		else
   		{
   			ArrayList<Integer>val=new ArrayList<Integer>();
   			if(has.containsKey(key.get(0)))
   			{
	   			val=has.get(key.get(0));
	   			has.remove(key.get(0));
   			}
   			int result=0;
   			for(int i=0;i<=maxtime;i++)
	   		{
	   			if(has.containsKey(i))
	   			{
		   			ArrayList<Integer>arr1=has.get(i);
		   			arr1.removeAll(val);
		   			if(arr1.size()==0)
		   			{
		   				has.remove(i);
		   			}
		   			else
		   			{
		   				if(has.get(i).size()>result)
		   				{
		   					result=has.get(i).size();
		   				}	
		   			}
	   			}
	   		}
   			count=count+result;
   		}
   		System.out.println(count);
   	}
}