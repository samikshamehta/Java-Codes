import java.util.Scanner;
import java.util.Stack;

public class StackCheckReduntantBracket
{
		public static void main(String[] args) throws Exception 
		{
		Scanner s= new Scanner(System.in);
		String exp=s.nextLine();
		boolean ans=checkRedundantBrackets(exp);
		System.out.print(ans);
		}
		public static boolean checkRedundantBrackets(String input)
		{
			Stack<Character> stacks=new Stack<Character>();
			if(input.length()==1)
			{
				return false;
			}		
			for(int i=0;i<input.length();i++)
			{
				char ch=input.charAt(i);
				if(ch != ')')
				{
					stacks.push(ch);
				}
				else
				{
					int count=0;
					while(stacks.pop()!='(')
					{
						count++;	
					}
					if(count==0)
					{
						return true;
					}
				}
			}
			return false;
		}
	}