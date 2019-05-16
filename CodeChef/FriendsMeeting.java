import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class FriendsMeeting {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			HashMap<Integer,Integer>hash=new HashMap<>();
			ArrayList<Integer>array=new ArrayList<Integer>();
			for(int j=0;j<n;j++)
			{
				int arr=s.nextInt();
				if(!hash.containsKey(arr))
				{
					array.add(arr);
					hash.put(arr,arr);
				}
			}
			int result=Integer.MAX_VALUE,loop=0;
			while(loop<array.size())
			{
				for(int j=1;j<array.size();j++)
				{
					int mul=array.get(loop)*array.get(j);
					int temp;
					boolean isPrime=true;
					for(int k=2;k<=mul/2;k++)
					{
				           temp=mul%k;
				           if(temp==0)
				           {
				        	   isPrime=false;
				        	   break;
				           }
					}
					if(isPrime)
					{
						if(result>mul)
						{
							result=mul;
						}
					}
				}
			loop++;
			}
			if(result==Integer.MAX_VALUE)
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(result);
			}
		}
	}
}
