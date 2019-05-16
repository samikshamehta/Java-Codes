import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class CandidateCodeB {
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
   		int t=maxtime,maxvalue=0,keyset = 0,prevkey=maxtime,k=0;
   		while(k<=maxtime)
   		{
   			if(len.get(k)>=0)
   			{
		   		for(int i=0;i<n;i++)
		   		{
		   			ArrayList<Integer> ans=new ArrayList<Integer>();
		   			if(!hash.containsKey(start.get(i)+len.get(i)))
		   			{
		   				ans.add(i+1);
		   				hash.put(start.get(i)+len.get(i),ans);
		   			}
		   			else
		   			{
		   				ans=hash.get(start.get(i)+len.get(i));
		   				ans.add(ans.size(),i+1);
			   			hash.put(start.get(i)+len.get(i),ans);		
		   			}
		   			len.set(i,len.get(i)-1);
		   		}
   			}
   			if(hash.containsKey(t))
   			{
   				if(maxvalue<hash.get(t).size())
   				{
   					maxvalue=hash.get(t).size();
   					keyset=t;
   				}
   				t--;
   			}
   			if(hash.containsKey(prevkey))
   			{
					ArrayList<Integer>arr1=hash.get(prevkey);
					if(hash.containsKey(prevkey-1))
					{
						ArrayList<Integer>arr2=hash.get(prevkey-1);
					}
   			}
   			k++;
   		}
   		/*for(int i=0;i<=maxtime;i++)
   		{
   			if(hash.containsKey(i))
   			{
	   			ArrayList<Integer>arr1=hash.get(i);
	   			for(int j=i+1;j<=maxtime;j++)
	   			{
	   				if(hash.containsKey(j))
	   				{
		   				ArrayList<Integer>arr2=hash.get(j);
		   				if(arr1.equals(arr2))
		   				{
			   				hash.remove(j);
			   			}
	   				}
	   			}
   			}
   		}*/
   		int maxval=0;
   		if(hash.size()>1)
   		{
	   		for(int i=0;i<=maxtime;i++)
	   		{
	   			ArrayList<Integer>arr1=hash.get(i);
	   			if(hash.containsKey(i))
	   			{
	   				for(int j=i+1;j<=maxtime;j++)
	   				{
	   					if(hash.containsKey(j))
	   					{
		   		   			ArrayList<Integer>arr2=hash.get(j);
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
	   				if(maxval==n)
			   		{
			   			break;
			   		}
	   			}
	   		}
   		}
   		else
   		{
   			for(int i=0;i<=maxtime;i++)
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
   		System.out.println(maxval);
   	}
}

