import java.util.Scanner;


public class DynammicProgrammingMatrixChainMultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int p[]=new int[n+1];
		for(int i=0;i<=n;i++)
		{
			p[i]=s.nextInt();
		}
		int ans=mcm(p);
		System.out.println(ans);
}
	public static int mcm(int[] p)
	{ 
		int storage[][] = new int[p.length][p.length]; 
			for(int i= p.length-2; i>= 1; i--)
			{ 
				for(int j =1; j<=p.length-1; j++)
				{ 
					if(i < j )
					{ 
						int minCost = Integer.MAX_VALUE; 
						for(int k = i; k < j; k++)
						{ 
							int cost = storage[i][k] + storage[k+1][j] + p[i-1]*p[k]*p[j]; 
							if(cost < minCost)
							{ 
								minCost = cost; 
							} 
							storage[i][j] = minCost; 
							
						} 
					} 
				} 
			}
		return storage[1][p.length-1]; 
	}
}
