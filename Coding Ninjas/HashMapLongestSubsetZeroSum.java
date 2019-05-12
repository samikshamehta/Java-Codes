import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;


public class HashMapLongestSubsetZeroSum {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr.add(i,s.nextInt());
		}
		int result=lengthOfLongestSubsetWithZeroSum(arr);
		System.out.println(result);
	}
    public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) 
   	{
    	HashMap<Integer,Integer>hash=new HashMap<>();
    	int sum=0;
    	int maxlength=0;
    	for(int i=0;i<arr.size();i++)
    	{
    		sum+=arr.get(i);
    		if(arr.get(i)==0 && maxlength==0)
    		{
    			maxlength=1;
    		}
    		if(sum==0)
    		{
    			maxlength=i+1;
    		}
    		Integer prev=hash.get(sum);
    		if(prev!=null)
    		{
    			maxlength=Math.max(maxlength, i-prev);
    		}
    		else
    		{
    			hash.put(sum,i);
    		}
    	}
    	return maxlength;
	}
}
