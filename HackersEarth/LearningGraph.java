import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class LearningGraph {
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int k=s.nextInt();
		int val[]=new int[n];
		int edges[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			val[i]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv-1][sv-1]=1;
			edges[sv-1][fv-1]=1;
		}
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer>arr=new ArrayList<Integer>();
			HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
			for(int j=0;j<n;j++)
			{
				if(edges[i][j]==1)
				{
					hash.put(j,val[j]);
				
					arr.add(val[j]);
				}
			}
			Collections.sort(arr);
			int result=arr.size()-k;
			ArrayList<Integer>same=new ArrayList<Integer>();
			for (Object l : hash.keySet()) 
			{
			      if (hash.get(l).equals(arr.get(result)))
			      {
			    	  same.add((int)l);
			      }
			}
			if(same.size()>1)
			{
				Collections.sort(same);
				System.out.println(same.get(same.size()-1)+1);
			}
			else
			{
				if(same.size()==1)
				{
					System.out.println(same.get(0)+1);
				}
				else
				{
					System.out.println(-1);
				}
			}
		}
	}
}
