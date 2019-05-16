import java.util.Scanner;


public class ProblemA {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		String f=s.next();
		String t=s.next();
		int result=function(f,t);
		System.out.println(result);
	}
	public static int function(String s,String t)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			int codes=getcode(s.charAt(i));
			int codet=getcode(t.charAt(i));
			if(codet>codes)
			{
				int val=codet-codes;
				if(val>13)
				{
					count+=val/13;
					val=val%13;
					count=count+val;
				}
				else
				{
					count+=val;
				}
			}
			else
			{
				if(codet<codes)
				{
					codes=26-codes;
					int val=codet+codes;
					if(val>13)
					{
						count+=val/13;
						val=val%13;
						count=count+val;
					}
					else
					{
						count+=val;
					}
				}
			}
		}
		return count;
	}
	private static int getcode(char alp)
	{
		switch(alp)
		{
	        case 'A' :
	        			return 1; 
	        case 'B' :
			        	return 2; 
	        case 'C' :
			        	return 3; 
	        case 'D' :
			        	return 4; 
	        case 'E' :
	        			return 5; 
	        case 'F' :
			        	return 6; 
	        case 'G' :
			        	return 7; 
	        case 'H' :
			        	return 8; 
	        case 'I' :
	        			return 9; 
	        case 'J' :
			        	return 10; 
	        case 'K' :
			        	return 11; 
	        case 'L' :
			        	return 12; 
	        case 'M' :
	        			return 13; 
	        case 'N' :
			        	return 14; 
	        case 'O' :
			        	return 15; 
	        case 'P' :
			        	return 16; 
	        case 'Q' :
	        			return 17; 
	        case 'R' :
			        	return 18; 
	        case 'S' :
			        	return 19; 
	        case 'T' :
			        	return 20; 
	        case 'U' :
	        			return 21; 
	        case 'V' :
			        	return 22; 
	        case 'W' :
			        	return 23; 
	        case 'X' :
			        	return 24; 
	        case 'Y' :
	        			return 25; 
	        case 'Z' :
			        	return 26; 
	    }
		return -1;
	}
}
