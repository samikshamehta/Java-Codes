import java.util.ArrayList;
import java.util.Scanner;


public class ProblemE {
	public static void main(String[] args)throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int Q=s.nextInt();
		int edges[][]=new int[N+1][N+1];
		for(int i=0;i<N-1;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		
		for(int i=0;i<Q;i++)
		{
			int max=Integer.MIN_VALUE;
			int k=s.nextInt();
			int arr[]=new int[k];
			for(int j=0;j<k;j++)
			{
				arr[j]=s.nextInt();
			}
			for(int j=0;j<k;j++)
			{
				for(int l=j+1;l<k;l++)
				{
					DFSpath(edges,arr[j],arr[l]);
					if(max<result)
					{
						max=result;
						result=0;
					}
				}
			}
			System.out.println(max);
		}
		
	}	
	static int result=0;
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
			result=pathList.size()-1;
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

