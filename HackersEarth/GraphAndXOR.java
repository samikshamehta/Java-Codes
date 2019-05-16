import java.util.HashMap;
import java.util.Scanner;


public class GraphAndXOR
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		HashMap<Integer,Integer>hash=new HashMap<>();
		int n=s.nextInt();
		int m=s.nextInt();
		int k=s.nextInt();
		int node[]=new int[n];
		for(int i=0;i<n;i++)
		{
			node[i]=s.nextInt();
		}
		int edges[][]=new int[m][2];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<2;j++)
			{
				edges[i][j]=s.nextInt();
			}
		}
	}
}
