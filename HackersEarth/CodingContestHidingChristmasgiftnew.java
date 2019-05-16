import java.io.*;
import java.util.*;
import java.util.LinkedList;
class Graph
{
     LinkedList<Integer> adj[]; 
    Graph(int v)
    {
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
     void addEdge(int v,int w) 
    {   
    	 adj[v].add(w);   
    }
}
 */
public class CodingContestHidingChristmasgiftnew {
	static Scanner scanner = new Scanner(System.in);
	public static Graph constructGraph(int noOfVertices)
	{		
		Graph graph=null;

		int u, v;
		while(scanner.hasNext())
		{
			int noOfEdges=noOfVertices-1;
			graph=new Graph(noOfVertices);
			for(int i=0;i<noOfEdges;i++)
			{
				u=scanner.nextInt();
				v=scanner.nextInt();
				graph.addEdge(u, v);
				graph.addEdge(v, u);
			}
			break;
		}
		return graph;
	}
	public static ArrayList<Integer> doBFSShortestPath(int noOfVertices,Graph graph, int source, int dest)
	{
		/*ArrayList<Integer> shortestPathList = new ArrayList<Integer>();
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		if (source == dest)
			return null;
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> pathStack = new Stack<Integer>();
		queue.add(source);
		pathStack.add(source);
		visited.put(source, true);
		while(!queue.isEmpty())
		{
			int u = queue.poll();
			ArrayList<Integer> adjList = graph.getOutEdges(u);
			for(int v : adjList)
			{
				if(!visited.containsKey(v))
				{
					queue.add(v);
					visited.put(v, true);
					pathStack.add(v);
					if(u == dest)
						break;
				}
			}
		}
		int node, currentSrc=dest;
		shortestPathList.add(dest);
		while(!pathStack.isEmpty())
		{
			node = pathStack.pop();
			if(graph.isNeighbor(currentSrc, node))
			{
				shortestPathList.add(node);
				currentSrc = node;
				if(node == source)
					break;
			}
		}
		return shortestPathList;
	}*/
		ArrayList<Integer> shortestPathList = new ArrayList<Integer>();
		LinkedList<Integer>temp;
		boolean visited[] = new boolean[noOfVertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[source]=true;
        queue.add(source);
        shortestPathList.add(source);
        Iterator<Integer> i;
        while (queue.size()!=0)
        {
            source = queue.poll();
            int n;
            i = graph.adj[source].listIterator();
             while (i.hasNext())
            {
                n = i.next();
                if (n==dest)
                    queue.add(n);
                	shortestPathList.add(n);
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                    shortestPathList.add(n);
                }
            }
        }
        return shortestPathList;
    }
	public static void findShortestPath()
	{
		int noOfVertices=scanner.nextInt();
		int m=scanner.nextInt();
		Graph graph = constructGraph(noOfVertices);
		HashMap<Integer,Integer>hash=new HashMap<>();
		for(int i=0;i<m;i++)
		{
			int source=scanner.nextInt();
			int dest=scanner.nextInt();
			ArrayList<Integer> shortestPathList =  doBFSShortestPath(noOfVertices,graph, source, dest);
			for(int node : shortestPathList)
			{
				if(hash.containsKey(node))
				{
					hash.put(node, hash.get(node)+1);
				}
				else
				{
					hash.put(node,1);
				}
			}
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
	public static void main(String[] args) {
		
		CodingContestHidingChristmasgiftnew.findShortestPath();
	}
}
