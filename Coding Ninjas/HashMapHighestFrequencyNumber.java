import java.util.HashMap;
import java.util.Scanner;


public class HashMapHighestFrequencyNumber
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int ans=maxFrequencyNumber(arr);
		System.out.print(ans);
	}
	public static int maxFrequencyNumber(int[] arr)
	{
		HashMap<Integer,Integer>hash=new HashMap<>();
		int result=0,ans=0;
		for(int val:arr)
		{
			if(hash.containsKey(val))
			{
				hash.put(val, hash.get(val)+1);
				if(result<hash.get(val))
				{
					result=hash.get(val);
					ans=val;
				}
			}
			else
			{
				hash.put(val, 1);
				if(result<hash.get(val))
				{
					result=hash.get(val);
					ans=val;
				}	
			}
		}
		return ans;
	}
}
