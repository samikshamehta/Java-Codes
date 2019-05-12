import java.util.HashMap;
import java.util.Scanner;


public class SpecialShop {
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		HashMap<Long,Long>hash=new HashMap<Long,Long>();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int a=s.nextInt();
			int b=s.nextInt();
			long val=Long.MAX_VALUE;
			/*if(a==b)
			{
				if(n%2==0)
				{
					int ans=(n/2)*(n/2);
					val=(a*ans)+(b*ans);
				}
				else
				{
					int ans=n/2;
					val=(a*(ans*ans))+(b*((ans+1)*(ans+1)));
				}
			}
			else
			{*/
				for(long j=0;j<=n;j++)
				{
					if(hash.containsKey(j) && hash.containsKey(n-j))
					{
						
						long cal=(a*hash.get(j))+(b*hash.get(n-j));
						if(val>cal)
						{
							val=cal;
						}
					}
					else
					{
						if(!hash.containsKey(j))
						{
							hash.put(j,j*j);
						}
						if(!hash.containsKey(n-j))
						{
							hash.put(n-j,(n-j)*(n-j));
						}
						long cal=(a*hash.get(j))+(b*hash.get(n-j));
						if(val>cal)
						{
							val=cal;
						}
					}
				}
			System.out.println(val);
		}
	}
}