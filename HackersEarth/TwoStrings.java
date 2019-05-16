import java.util.Arrays;
import java.util.Scanner;
public class TwoStrings 
{
	private static Scanner s = new Scanner(System.in);
	public static void main(String args[] ) throws Exception
	{
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				String one=s.next();
				String two=s.next();
				if(one.length()==two.length())
				{
					char arrone[]=new char[one.length()];
					char arrtwo[]=new char[two.length()];
					for(int j=0;j<one.length();j++)
					{
						arrone[j]=one.charAt(j);
					}
					for(int j=0;j<two.length();j++)
					{
						arrtwo[j]=two.charAt(j);
					}
					Arrays.sort(arrone);
					Arrays.sort(arrtwo);
					int flag=0;
					for(int k=0;k<arrone.length;k++)
					{
						if(arrone[k]!=arrtwo[k])
						{
							flag=1;
						}
					}
					if(flag==0)
					{
						System.out.println("YES");
					}
					else
					{
						System.out.println("NO");
					}
				}
				else
				{
					System.out.println("NO");
				}
				
			}
	}
}