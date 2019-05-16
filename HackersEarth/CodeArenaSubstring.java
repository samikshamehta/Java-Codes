import java.util.Scanner;


public class CodeArenaSubstring {
	public static void main(String[] args)throws Exception
{
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		String str=s.next();
		String substr = "";
		int sum=0;
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)=='A'||str.charAt(j)=='a'||str.charAt(j)=='B'||str.charAt(j)=='b'||str.charAt(j)=='C'||str.charAt(j)=='c')
			{
				substr+=str.charAt(j);
			}
			else
			{
				sum+=sumfun(substr.length());
				substr="";
			}
		}
		sum+=sumfun(substr.length());
		System.out.println(sum+" ");
	}
}
	public static int sumfun(int n) 
	{
		int result=0;
	    for(int i=1;i<=n;i++)
	    {
	    	result+=i;
	    }
	    return result;
	}
}
