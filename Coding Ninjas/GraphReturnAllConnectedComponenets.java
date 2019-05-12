import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class GraphReturnAllConnectedComponenets {
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
		print(edges);
	}		
	public static void print(int edges[][])
	{
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++)
		{
			if(!visited[i])
			{
				ArrayList<Integer>arr=new ArrayList<Integer>();
				ArrayList<Integer>result=printhelper(edges,i,visited,arr);
				Collections.sort(result);
				for(int j=0;j<result.size();j++)
				{
					System.out.print(result.get(j)+" ");
				}
				System.out.println();
			}
		}
	}
	public static ArrayList<Integer> printhelper(int edges[][],int sv,boolean visited[],ArrayList<Integer>arr)
	{
		LinkedList<Integer> queue=new LinkedList<>();
		queue.addLast(sv);
		visited[sv]=true;
		while(!queue.isEmpty())
		{
			int ans=queue.removeFirst();
			arr.add(ans);
			for(int i=0;i<edges.length;i++)
			{
				if(edges[ans][i]==1 && !visited[i])
				{
					queue.add(i);
					visited[i]=true;
				}
			}
		}
		return arr;
	}
}

