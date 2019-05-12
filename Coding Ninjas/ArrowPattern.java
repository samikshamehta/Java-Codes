import java.util.Scanner;


public class ArrowPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if(n%2!=0)
		{
			for(int i=1;i<=(n+1)/2;i++)
			{
				for(int j=0;j<i-1;j++)
					{
						System.out.print("_");
					}
					for(int j=0;j<i;j++)
					{
						System.out.print("* ");
					}
				System.out.println();
			}
			for(int i=n;i>=((n+1)/2)+1;i--)
			{
				for(int j=i;j>=((n+1)/2)+2;j--)
					{
						System.out.print("_");
					}
					for(int j=i;j>(n+1)/2;j--)
					{
						System.out.print("* ");
					}
				System.out.println();
			}
		}
		
	}

}
