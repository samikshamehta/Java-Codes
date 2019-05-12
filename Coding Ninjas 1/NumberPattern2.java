import java.util.Scanner;

public class NumberPattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int i,j,k=0;
		for(i=1;i<=N;i++)
		{
			if(i==1)
			{
				System.out.print("1");
			}
			else
			{
				for(j=1;j<=i;j++)
				{
					if(j==1||j==i)
					{
						System.out.print(k);
					}
					else
					{
						System.out.print("0");
					}
				}
			}
			k++;
			System.out.println();
		}
	}
}
					