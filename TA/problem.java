import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
class problem{
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
	public static int maxFrequencyNumber(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      
      int maxfreq = 1;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
				if(map.get(arr[i]) > maxfreq)
				{
					maxfreq = map.get(arr[i]);
				}
			}
			else
			{
				map.put(arr[i],1);
			}
		}
     /* if(map.size() == arr.length)
      {
        return arr[0];
      }*/
			Set<Integer> elements = map.keySet();
			int ans = 1;
			for(int x:elements)
			{
				if(map.get(x) == maxfreq)
				{
					ans = x;
					break;
				}
			}
		return ans;	
		
	}
}