import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ProblemB {
	public static void main(String[] args) throws Exception {
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	ArrayList<Integer>arr=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	{
		arr.add(s.nextInt());
	}
	ArrayList<Integer> result=function(arr,k);
	for(int i=0;i<result.size();i++)
	{
		System.out.print(result.get(i)+" ");
	}
	}
	public static ArrayList<Integer> function(ArrayList<Integer>arr,int k)
	{
		ArrayList<Integer>a=new ArrayList<Integer>();
		while(k>0)
		{
			a.add(0,arr.get(0));
			for(int i=1;i<arr.size();i++)
			{
				a.add(i,arr.get(i)|arr.get(i-1));
			}
		    Collections.copy(arr,a);
		    a.clear();
			k--;
		}
		return arr;
	}

}
