import java.util.LinkedList;
import java.util.Scanner;


public class GraphBFS 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int edges[][]=new int[V][V];
		if(V==0)
		{
			System.out.println(0);
		}
		else
		{
			for(int i=0;i<E;i++)
			{
				int fv=s.nextInt();
				int sv=s.nextInt();
				edges[fv][sv]=1;
				edges[sv][fv]=1;
			}
			print(edges);
		}
	}	
	public static void print(int edges[][])
	{
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++)
		{
			if(!visited[i])
			{
				printhelper(edges,i,visited);
			}
		}
	}
	public static void printhelper(int edges[][],int sv,boolean visited[])
	{
		LinkedList<Integer> queue=new LinkedList<>();
		queue.addLast(sv);
		visited[sv]=true;
		while(!queue.isEmpty())
		{
			int ans=queue.removeFirst();
			System.out.print(ans+" ");
			for(int i=0;i<edges.length;i++)
			{
				if(edges[ans][i]==1 && !visited[i])
				{
					queue.add(i);
					visited[i]=true;
				}
			}
		}
	}
}

