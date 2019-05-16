import java.util.HashMap;
import java.util.Scanner;


public class MonkInTheRealEstate {
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int r=s.nextInt();
			HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
			for(int j=0;j<r;j++)
			{
				int fv=s.nextInt();
				if(!hash.containsKey(fv))
				{
					hash.put(fv,fv);
				}
				int sv=s.nextInt();
				if(!hash.containsKey(sv))
				{
					hash.put(sv,sv);
				}
			}
			System.out.println(hash.size());
		}
	}
}
