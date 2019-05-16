import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class CandidateCodePrev {
    public static void main(String args[] ) throws Exception
   	{
   		Scanner s = new Scanner(System.in);
   		int n=s.nextInt();
   		ArrayList<Integer> len=new ArrayList<Integer>();
   		ArrayList<Integer> start=new ArrayList<Integer>();
   		ArrayList<Integer> end=new ArrayList<Integer>();
   		int maxtime=0;
   		for(int i=0;i<n;i++)
   		{
   			len.add(i,s.nextInt());
   		}
   		for(int i=0;i<n;i++)
   		{
   			start.add(s.nextInt());
   			end.add(start.get(i)+len.get(i));
   			if(end.get(i)>maxtime)
   			{
   				maxtime=end.get(i);
   			}
   		}
   		ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
   		int fish=1;
   		for(int i=0;i<=maxtime;i++)
   		{
   			ans.add(new ArrayList<Integer>());
   			ans.get(i).add(0);
   		}
   		for(int i=0;i<n;i++)
   		{
   			for(int j=start.get(i);j<=end.get(i);j++)
   			{
   				if(ans.get(j).get(0)==0)
   				{
   					ans.get(j).set(0,fish);
   				}
   				else
   				{
   					ans.get(j).add(fish);
   				}
   			}
   			fish++;
   		}
   		int maxval=0;
   		for(int k=0;k<=maxtime;k++)
   		{
   			HashMap<Integer,Integer>hash=new HashMap<>();
   			HashMap<Integer,Integer>crosscheck=new HashMap<>();
   			for(int j=0;j<ans.get(k).size();j++)
   			{
   				if(ans.get(k).get(j)==0)
   				{
   					break;
   				}
   				else
   				{
					hash.put(ans.get(k).get(j),ans.get(k).get(j));
					crosscheck.put(ans.get(k).get(j),ans.get(k).get(j));
   				}
   			}
   			if(!hash.isEmpty())
   			{
   				for(int i=k+1;i<=maxtime;i++)
		   		{
		   			for(int j=0;j<ans.get(i).size();j++)
			   		{
		   				if(ans.get(i).get(j)!=0)
		   	   			{
			   				if(!hash.containsKey(ans.get(i).get(j)))
							{
			  					hash.put(ans.get(i).get(j),ans.get(i).get(j));
			   				}
		   				}
			   		}	
		   			if(hash.size()>maxval)
		   	   		{
		   	   		maxval=hash.size();
		   	   		}
		   			hash.clear();
		   			hash.putAll(crosscheck);
		   		}
   			}
   		}
   		System.out.println(maxval);
   	}
   
}
