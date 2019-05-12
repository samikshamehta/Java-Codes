import java.util.LinkedList;
import java.util.Scanner;
public class GraphHasPath 
{
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
		haspath(edges,v1,v2);
	}	
	public static void haspath(int edges[][],int v1,int v2)
	{
		boolean visited[]=new boolean[edges.length];
		boolean ans = haspathhelper(edges,visited,v1,v2);
		System.out.println(ans);
	}
	public static boolean haspathhelper(int edges[][],boolean visited[],int v1,int v2)
	{
		LinkedList<Integer> queue=new LinkedList<>();
		queue.add(v1);
		visited[v1]=true;
		while(!queue.isEmpty())
		{
			int ans=queue.remove();
			for(int i=0;i<edges.length;i++)
			{
				if(edges[ans][i]==1 && !visited[i])
				{
					if(i==v2)
					{
						return true;
					}
					queue.add(i);
					visited[i]=true;
				}
			}
		}
		return false;
	}
}

