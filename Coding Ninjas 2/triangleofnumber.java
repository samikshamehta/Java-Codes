import java.util.Scanner;


public class triangleofnumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int i,j,k,l,d=0;
		for(i=0;i<N;i++)
		{
			for(j=(N-1);j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(++d);
			}
			for(l=i;l>0;l--)
			{
				System.out.print(--d);
			}
			System.out.println();
		}
	}
}