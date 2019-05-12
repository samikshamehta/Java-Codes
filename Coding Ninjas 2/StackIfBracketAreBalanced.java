import java.util.Scanner;


public class StackIfBracketAreBalanced {

	
	public static void main(String[] args) throws Exception {
		Scanner s= new Scanner(System.in);
		String exp=s.nextLine();
		boolean ans=checkBalanced(exp);
		System.out.print(ans);
	}
	public static boolean checkBalanced(String exp) 
	{
		Stack<Character> stacks=new Stack<Character>(exp.length());
		if(exp.length()==1)
		{
			return false;
		}		
		for(int i=0;i<exp.length();i++)
		{
			char ch=exp.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{')
			{
				try {
						stacks.push(ch);
					}
					catch (StackOverFlowException e) 
					{
						e.printStackTrace();
					}
			}
			else
			{
				if(ch == ']' || ch == ')' || ch == '}')
				{
					if(stacks.isEmpty())
					{
						return false;
					}
					char temp=' ';
					try 
					{
						temp = stacks.pop();
					}
					catch (StackUnderFlowException e) 
					{
						e.printStackTrace();
					}
					switch(ch)
					{
						case ']':
									if(temp!='[')
									{
										return false;
									}
									break;
						case ')':
									if(temp!='(')
									{
										return false;
									}
									break;
						case '}':
									if(temp!='{')
									{
										return false;
									}
									break;
					}	
				}
			}			
		}
		if(stacks.isEmpty())
		{
			return true;
		}
      else
      {
        return false;
      }
	}
}