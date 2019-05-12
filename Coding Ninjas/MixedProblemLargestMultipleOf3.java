import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;



public class MixedProblemLargestMultipleOf3 {
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr.add(s.nextInt());
		}
		ArrayList<Integer>result= largestMultiple3(arr);
		System.out.println(result);
	}
	
	public static ArrayList<Integer> largestMultiple3(ArrayList<Integer> input) 
	{
		int arr[]=new int[input.size()];
		for(int i=0;i<input.size();i++)
		{
			arr[i]=input.get(i);
		}
		ArrayList<Integer>result=LargestMultiple3(arr);
		return result;
	}
	public static ArrayList<Integer> LargestMultiple3(int[] input) 
	{
		LinkedList<Integer> queue0 = new LinkedList<Integer>(); 
		LinkedList<Integer> queue1 = new LinkedList<Integer>(); 
		LinkedList<Integer> queue2 = new LinkedList<Integer>(); 
		Arrays.sort(input);
		int sum=0;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
			switch(input[i]%3)
			{
				case 0:
						queue0.add(input[i]);
						break;
				case 1:	
						queue1.add(input[i]);
						break;
				default: 
						queue2.add(input[i]);
						break;
			}
		}
		switch(sum%3)
		{
			case 1:  
					if (!queue1.isEmpty())
					{
						queue1.remove();
					}
					else 
					{
						if (!queue2.isEmpty())
						{
							queue2.remove();
						} 
						if (!queue2.isEmpty())
						{
							queue2.remove();
						}
					}
					break;
			case 2:
					if (!queue2.isEmpty()) 
					{
						queue2.remove();
					} else 
					{
						if (!queue1.isEmpty())
						{
							queue1.remove();
						} 
						if (!queue1.isEmpty())
						{
							queue1.remove();
						} 
					}
		}
		 ArrayList<Integer>list=new ArrayList<Integer>();
		 list.addAll(queue0);
		 list.addAll(queue1);
		 list.addAll(queue2);
		 Collections.sort(list);
		 Collections.reverse(list);
		 return list;
	}
}
