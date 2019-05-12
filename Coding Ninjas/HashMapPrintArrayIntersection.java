import java.util.HashMap;
import java.util.Scanner;


public class HashMapPrintArrayIntersection 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=s.nextInt();
		}
		int m=s.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=s.nextInt();
		}
		intersection(arr1,arr2);
	}
	public static void intersection(int[] arr1, int[] arr2)
	{
		HashMap<Integer,Integer>hash=new HashMap<>();
		for(int val1:arr1)
		{
			if(hash.containsKey(val1))
			{
				hash.put(val1, hash.get(val1)+1);
			}
			else
			{
				hash.put(val1,1);
			}
		}
		for(int val2:arr2)
		{
			  if(hash.containsKey(val2))
			  {
				  if(hash.get(val2)>0)
				  {
					  System.out.println(val2+" ");
					  hash.put(val2,hash.get(val2)-1);
				  }
			  }
		}
	}
}