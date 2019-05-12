import java.util.HashMap;
import java.util.Scanner;


public class HashPairSumTo0 
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
		PairSum(arr,n);
	}
	public static void PairSum(int[] input, int size) 
	{
		HashMap<Integer,Integer>hash=new HashMap<>();
		for(int val:input)
		{
			if(val>0)
			{
				if(hash.containsKey(val))
				{
					hash.put(val,hash.get(val)+1);
				}
				else
				{
					hash.put(val, 1);
				}
			}
		}
		for(int value:input)
		{
			int count=0;
			if(value<0)
			{
				if(hash.containsKey(-(value)))
				{
					while(count!=hash.get(-(value)))
					{
						System.out.println(value+" "+-(value));
						count++;
					}
				}
			}
		}
	}
}
