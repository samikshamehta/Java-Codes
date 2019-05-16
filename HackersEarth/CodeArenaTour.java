import java.util.HashMap;
import java.util.Scanner;


public class CodeArenaTour {
	public static void main(String[] args)throws Exception
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		String name[]=new String[n];
		HashMap<String,Integer>hash=new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			name[i]=s.next();
			hash.put(name[i],i);
		}
		int costmatrix[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				costmatrix[i][j]=s.nextInt();
			}
		}
		int p=s.nextInt();
		String city[]=new String[p+1];
		city[0]=name[0];
		for(int i=1;i<=p;i++)
		{
			city[i]=s.next();
		}
		int sum=0;
		int source=0,dest=0;
		for(int i=1;i<=p;i++)
		{
			if(hash.containsKey(city[i-1])&& hash.containsKey(city[i]))
			{
				source=hash.get(city[i-1]);
				dest=hash.get(city[i]);
				sum+=costmatrix[source][dest];		
			}
		}
		System.out.println(sum);
	}
}
