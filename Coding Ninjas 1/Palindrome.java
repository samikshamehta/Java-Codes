import java.util.Scanner;

import java.util.Scanner;
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		boolean c= checkPalindrome(str);
		System.out.print(c);
	}
		public static boolean checkPalindrome(String str){
			int val=str.length();
			for(int j=0,i=val-1;i>(val+1)/2;i--,j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					return false;
					
				}
			}
			return true;
		}
	}
