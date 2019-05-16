import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class LinearSearchBreakUpApp 
{
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[] ) throws Exception
	{
			String t=reader.readLine();
			int line=Integer.parseInt(t);
			int ans[][]=new int[32][2];
			for(int i=0;i<line;i++)
			{
				String msg=reader.readLine();
				int mul=1;
				if(msg.charAt(0)=='G')
				{
					mul=2;
				}
				for(int j=1;j<msg.length();j++)
				{
					if(msg.charAt(j)>='1' && msg.charAt(j)<='9')
					{
						if(j!=msg.length()-1)
						{
							if(msg.charAt(j+1)>='1' && msg.charAt(j+1)<='9')
							{
								int val=Integer.parseInt((""+msg.charAt(j)+msg.charAt(j+1)));
								ans[val][0]=val;
								ans[val][1]=ans[val][1]+mul;
								j=j+1;
							}
						}
						else
						{
							int val=Integer.parseInt(""+msg.charAt(j));
							ans[val][0]=val;
							ans[val][1]=ans[val][1]+mul;
						}
					}
				}
			}
			int result=0,max=0;
			for(int i=0;i<ans.length;i++)
			{
				for(int j=1;j<ans[i].length;j++)
				{
					if(ans[i][j]>=max)
					{
						max=ans[i][j];
						result=ans[i][j-1];
					}
				}
			}
			if(result==19 || result==20)
			{
				System.out.println("DATE");
			}
			else
			{
				System.out.println("NO DATE");
			}
			
	}
}