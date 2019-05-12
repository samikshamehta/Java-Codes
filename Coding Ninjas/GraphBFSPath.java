import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class GraphBFSPath {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int edges[][]=new int[V][V];
		for(int i=0;i<E;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		int v1=s.nextInt();
		int v2=s.nextInt();
		BFSpath(edges,v1,v2);
	}	
	public static void BFSpath(int edges[][],int v1,int v2)
	{
		boolean visited[]=new boolean[edges.length];
		ArrayList<Integer>path=new ArrayList<>();
		path.add(v1);
		BFSpathhelper(edges,visited,v1,v2,path);
	}
	public static void BFSpathhelper(int edges[][],boolean visited[],int v1,int v2,ArrayList<Integer>path)
	{
		LinkedList<Integer> queue=new LinkedList<>();
		HashMap<Integer,Integer>hash=new HashMap<>();
		int v = v1;
		queue.addLast(v1);
		visited[v1]=true;
		while(!queue.isEmpty())
		{
			int ans=queue.removeFirst();
			for(int i=0;i<edges.length;i++)
			{
				if(edges[ans][i]==1 && !visited[i])
				{
					if(i==v2)
					{
						v=i;
						queue.add(i);
						visited[i]=true;
						hash.put(i,ans);
					}
					else
					{
						queue.add(i);
						visited[i]=true;
						hash.put(i,ans);
					}
				}
			}
		}
		if(v==v2)
		{
			int i=v2;
			while(i!=v1)
			{
				System.out.print(i+ " ");
				i=hash.get(i);
			}
			if(i==v1)
			{
				System.out.print(i+" ");
			}
		}
	}
}

