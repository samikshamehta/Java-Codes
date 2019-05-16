import java.util.Scanner;
public class LinearSMonkTakesAWalk
{
	private static Scanner s = new Scanner(System.in);
	public static void main(String args[] ) throws Exception
	{
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				String tree=s.next();
				int count=0;
				char vowel[]={'a','e','i','o','u','A','E','I','O','U'};
				for(int k=0;k<tree.length();k++)
				{
					for(int j=0;j<vowel.length;j++)
					{
						if(tree.charAt(k)==vowel[j])
						{
							count++;
						}
					}
				}
				System.out.println(count);
			}
	}
}