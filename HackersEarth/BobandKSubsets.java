import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class BobandKSubsets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		printSubsets(arr,k);
		System.out.println(hash.size());
	}
	static HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
	static void printSubsets(int set[],int k)
    {
        int n = set.length;
         for (int i = 0; i < (1<<n); i++)
        {
        	int val=0,flag=0;
        	 ArrayList<Integer>array=new ArrayList<Integer>();
            for (int j = 0; j < n; j++)
            {
                 if ((i & (1 << j)) > 0)
                 {
                    array.add(set[j]);
                    val=val|set[j];
                 }
            }
            if(array.size()<=k && array.size()>0)
    		{
    			flag=1;
    		}
    		if(flag==1)
    		{
    			if(!hash.containsKey(val))
    			{
    				hash.put(val, val);
    			}
    		}
        }
    }
}