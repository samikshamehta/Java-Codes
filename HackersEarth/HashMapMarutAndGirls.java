import java.util.HashMap;
import java.util.Scanner;


public class HashMapMarutAndGirls
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		HashMap<Integer,Integer>hash=new HashMap<>();
		int m=s.nextInt();
		int arr[]=new int[m];
		for(int i=0;i<m;i++)
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
		int n=s.nextInt();
		s.nextLine();
		String array[]=new String[n];
		for(int i=0;i<n;i++)
		{
			array[i]=s.nextLine();
		}
		int value[][]=new int[n][];
		for(int i=0;i<n;i++)
		{
			String split[]=array[i].split(" ");
			value[i]=new int[split.length];
			for(int j=0;j<split.length;j++)
			{
				value[i][j]=Integer.parseInt(split[j]);
			}
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			int flag=0;
			for(int j=0;j<value[i].length;j++)
			{
				if(hash.containsKey(value[i][j]))
				{
					flag++;
				}
			}
			if(flag>=m)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}