import java.util.Scanner;

public class StackReverse
{
	public static void main(String[] args) throws Exception
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		Stack<Integer> s1=new Stack<Integer>(n);
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			s1.push(data);
		}
		Stack<Integer> s2=new Stack<Integer>(n);
		reverseStack(s1,s2);
	}
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2)
	{
		int n=0;
		try 
		{
			n = s1.pop();
		} 
		catch (StackUnderFlowException e) 
		{
			e.printStackTrace();
		}
		ReverseStack(s1, s2, n);
	}
	public static void ReverseStack(Stack<Integer> s1, Stack<Integer> s2,int n)
	{
		int pop=0;
		if(!s1.isEmpty())
		{
			try 
			{
				pop=s1.pop();
			} 
			catch (StackUnderFlowException e)
			{
				e.printStackTrace();
			}
			ReverseStack(s1,s2,pop);	
		}
		if(s1.isEmpty()||!s2.isFull())
		{
			try 
			{
				s2.push(n);
			} 
			catch (StackOverFlowException e) 
			{
				e.printStackTrace();
			}
		}
		if(s2.isFull())
		{
			while(!s1.isFull())
			{
				int val=0;
				try 
				{
					val = s2.pop();
				} 
				catch (StackUnderFlowException e) 
				{
					e.printStackTrace();
				}
				try 
				{
					s1.push(val);
				} 
				catch (StackOverFlowException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
