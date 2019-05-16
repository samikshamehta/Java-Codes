import java.util.Scanner;


public class MonkTeachesPalindrome
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			String str=s.next();
			int len=str.length();
			String ans;
			boolean result= checkPalindrome(str);
			if(len%2==0)
			{
				ans="EVEN";
			}
			else
			{
				ans="ODD";
			}
			if(result)
			{
				System.out.println("YES"+" "+ans);
			}
			else
			{
				System.out.println("NO");			
			}
		}
	}
		public static boolean checkPalindrome(String str){
			int val=str.length();
			for(int j=0,i=val-1;i>=(val+1)/2;i--,j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					return false;
					
				}
			}
			return true;
		}
	}
