import java.util.Scanner;


public class GraphDFS 
{
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		int V=s.nextInt();
		int E=s.nextInt();
		int edges[][]=new int[V][V];
		for(int i=0;i<E;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		print(edges);
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
		System.out.print(sv+" ");
		visited[sv]=true;
		for(int i=0;i<edges.length;i++)
		{
			if(edges[sv][i]==1 && !visited[i])
			{
				printhelper(edges,i,visited);
			}
		}
	}

}
