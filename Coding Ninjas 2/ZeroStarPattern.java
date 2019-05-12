import java.util.Scanner;


public class ZeroStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n+1;i++)
		{
			for(int j=1; j<=(2*n)+1;j++)
			{
				if(j==n+1)
				{
					System.out.print("*");
				}
				else
				{
					if(j==i || j==(((2*n)+1)-i)+1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("0");
					}
				}
			}
			System.out.println();
		}
	}

}
