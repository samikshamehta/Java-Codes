import java.util.Scanner;


public class GraphIsConnected {
	public static void main(String[] args)
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
		boolean ans=print(edges);
		System.out.println(ans);
	}	
	public static boolean print(int edges[][])
	{
		boolean visited[]=new boolean[edges.length];
		printhelper(edges,0,visited);
		for(int i=0;i<edges.length;i++)
		{
			if(visited[i]==false)
			{
				return false;
			}
		}
		return true;
	}
	public static void printhelper(int edges[][],int sv,boolean visited[])
	{
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
