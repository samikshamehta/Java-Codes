import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class CodingContestHiddingChristmasGift {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int graph[][]=new int[n+1][n+1];
		HashMap<Integer,Integer>hash=new HashMap<>();
		for(int i=0;i<n+1;i++)
		{
			graph[0][i]=-1;
			graph[i][0]=-1;
		}
		for(int i=1;i<n;i++)
		{
			int u=s.nextInt();
			int v=s.nextInt();
			graph[u][v]=1;
			graph[v][u]=1;
		}
		for(int i=0;i<m;i++)
		{
			int source=s.nextInt();
			int destination=s.nextInt();
			BFSpath(graph,source,destination,hash);
		}
		int count=Integer.MIN_VALUE;
		for(Integer value:hash.values())
		{
			if(value>count)
			{
				count=value;
			}
		}
		System.out.println(count);
	}
	public static void BFSpath(int edges[][],int v1,int v2,HashMap<Integer,Integer>hash)
	{
		boolean visited[]=new boolean[edges.length];
		ArrayList<Integer>path=new ArrayList<>();
		path.add(v1);
		visited[v1]=true;
		BFSpathhelper(edges,visited,v1,v2,path,hash);
	}
	public static void BFSpathhelper(int edges[][],boolean visited[],int v1,int v2,ArrayList<Integer>path,HashMap<Integer,Integer>hash)
	{
		if(v1==v2)
		{
			int i=1;
			while((path.size()-i)!=-1)
			{
				if(hash.containsKey(path.get(path.size()-i)))
				{
					hash.put(path.get(path.size()-i), hash.get(path.get(path.size()-i))+1);
				}
				else
				{
					hash.put(path.get(path.size()-i),1);
				}
				i++;
			}
			
		}
		for(int i=0;i<edges.length;i++)
		{
			if(edges[v1][i]==1 && !visited[i])
			{
				if(i==v2)
				{
					path.add(i);
					visited[i]=true;
					BFSpathhelper(edges,visited,i,v2,path,hash);
					break;
				}
				path.add(i);
				visited[i]=true;
				BFSpathhelper(edges,visited,i,v2,path,hash);
				if(!path.isEmpty())
				{
					path.remove(path.size()-1);
				}
			}
		}
	}
}