import java.util.Stack;
import java.util.Scanner;


public class StackReverseNew 
{
	public static void main(String[] args) throws Exception
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		Stack<Integer>s1=new Stack<Integer>();
		Stack<Integer>s2=new Stack<Integer>();
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			s1.push(data);
		}
		reverseStack(s1,s2);
	}
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2)
	{
		if(s1.size()==0)
		{
			return;
		}
		int x=s1.pop();
		reverseStack(s1,s2);
		while(s1.size()!=0)
		{
			s2.push(s1.pop());
		}
		s1.push(x);
		while(s2.size()!=0)
		{
			s1.push(s2.pop());
		}
	}
}
