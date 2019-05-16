import java.util.Scanner;
public class LinearSearchMonkTakesAWalk {
	private static Scanner s = new Scanner(System.in);
	public static void main(String args[] ) throws Exception
	{
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				String tree=s.next();
				char vowel[]={'a','e','i','o','u','A','E','I','O','U'};
				int sum=0;
				int count=MonkTakesAWalk(tree,vowel,sum);
				System.out.println(count);
			}
	}
	public static int MonkTakesAWalk(String tree,char vowel[],int sum)
	{
		if(tree.length()==0)
		{
			return sum;
		}	
		sum=MonkTakesAWalk(tree.substring(1),vowel,sum);
		for(int i=0;i<vowel.length;i++)
		{
			if(tree.charAt(0)==vowel[i])
			{
				sum=sum+1;				
			}
		}
		return sum;
	}
}
