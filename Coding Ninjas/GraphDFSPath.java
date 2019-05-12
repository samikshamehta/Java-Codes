import java.util.ArrayList;
import java.util.Scanner;


public class GraphDFSPath {
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
				int v1=s.nextInt();
				int v2=s.nextInt();
				DFSpath(edges,v1,v2);
			}	
			public static void DFSpath(int edges[][],int v1,int v2)
			{
				boolean visited[]=new boolean[edges.length];
				ArrayList<Integer> pathList = new ArrayList<>();
				pathList.add(v1);
				DFSpathhelper(edges,visited,v1,v2,pathList);
			}
			public static void DFSpathhelper(int edges[][],boolean visited[],int v1,int v2,ArrayList<Integer> pathList)
			{
				visited[v1]=true;
				if(v1==v2)
				{
					for(int i=pathList.size()-1;i>=0;i--)
					{
						System.out.print(pathList.get(i)+" ");
					}
				}
				else
				{				
					for(int i=0;i<edges.length;i++)
					{
						if(edges[v1][i]==1 && !visited[i])
						{
							pathList.add(i);
							DFSpathhelper(edges,visited,i,v2,pathList);
							pathList.remove(new Integer(i));
						}
					}
				}
			}
		}
	
