import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class CandidateCodeBR {
    public static void main(String args[] ) throws Exception
   	{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String a=reader.readLine();
   		int n=Integer.parseInt(a);
   		ArrayList<Integer> len=new ArrayList<Integer>();
   		ArrayList<Integer> start=new ArrayList<Integer>();
   		ArrayList<Integer> end=new ArrayList<Integer>();
   		int maxtime=0;
   		String line = reader.readLine();
   		String[] strs = line.trim().split(" ");
   		for(int i=0;i<n;i++)
   		{
   			len.add(i,Integer.parseInt(strs[i]));
   		}
   		String line1 = reader.readLine();
   		String[] strs1 = line1.trim().split(" ");
   		for(int i=0;i<n;i++)
   		{
   			start.add(Integer.parseInt(strs1[i]));
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
   		for(int i=0;i<=maxtime;i++)
   		{
   			boolean flag=false;
   			if(ans.get(i).get(0)!=0)
   			{
	   			for(int k=i+1;k<=maxtime;k++)
	   			{
	   				if(ans.get(i).size()==ans.get(k).size())
	   				{
			   			for(int j=0;j<ans.get(i).size();j++)
			   			{
			   				if(ans.get(i).get(j)==ans.get(k).get(j))
			   				{
			   					flag=true;
			   				}
			   				else
			   				{
			   					flag=false;
			   					break;
			   				}
			   			}
			   			if(flag==true)
			   			{
			   				ans.remove(k);
			   				maxtime--;
			   				k--;
			   			}
	   				}
	   			}
   			}
   			else
   			{
   				ans.remove(i);
   				maxtime--;
   				i--;
   			}
   		}
   		int maxval=0;
   		for(int k=0;k<=maxtime;k++)
   		{
   			HashMap<Integer,Integer>hash=new HashMap<>();
   			HashMap<Integer,Integer>crosscheck=new HashMap<>();
   			for(int j=0;j<ans.get(k).size();j++)
   			{
   				hash.put(ans.get(k).get(j),ans.get(k).get(j));
				crosscheck.put(ans.get(k).get(j),ans.get(k).get(j));
   			}
   			if(ans.size()>1)
   			{
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
   			else
   			{
   				if(hash.size()>maxval)
	   	   		{
	   	   			maxval=hash.size();
	   	   		}
   			}
   		}
   		System.out.println(maxval);
   	}
}
