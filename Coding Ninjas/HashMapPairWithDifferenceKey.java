import java.util.Scanner;
import java.util.HashMap;


public class HashMapPairWithDifferenceKey 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++)
		{
			input[i]=s.nextInt();
		}
		int k=s.nextInt();
		findPairsDifferenceK(input,k);
	}
	public static void findPairsDifferenceK(int[] input, int k)
	{
		HashMap<Integer,Integer>hash=new HashMap<>();
		for(int i=0;i<input.length;i++)
		{
			if(hash.containsKey(input[i]))
			{
				hash.put(input[i],hash.get(input[i])+1);
			}
			else
			{
				hash.put(input[i],1);
			}
		}
		for(int j=0;j<input.length-1;j++)
		{
			for(int l=j+1;l<input.length;l++)
			{
				if(input[j]>input[l] && input[j]-input[l]==k)
				{
					if(hash.get(input[j])!=0 && hash.get(input[l])!=0)
					{
						System.out.println(input[l]+" "+input[j]);
					}
				}
				else
				{
					if(input[l]>=input[j] && input[l]-input[j]==k)
					{
						if(hash.get(input[j])!=0 && hash.get(input[l])!=0)
						{
							System.out.println(input[j]+" "+input[l]);
						}
					}
				}
			}
			hash.put(input[j], hash.get(input[j])-1);
		}
	}
}
