import java.util.HashMap;
import java.util.Scanner;


public class HashMapKKAndCrush {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int j=0;j<t;j++)
		{
			HashMap<Integer,Integer>hash=new HashMap<>();
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
				if(hash.containsKey(arr[i]))
				{
					hash.put(arr[i], hash.get(arr[i])+1);
				}
				else
				{
					hash.put(arr[i],1);
				}
			}
			int k=s.nextInt();
			for(int i=0;i<k;i++)
			{
				int value=s.nextInt();
				if(hash.containsKey(value))
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}
			}
		}
	}
}
