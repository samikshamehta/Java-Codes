
import java.util.Scanner;

public class starpattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int i,j,k;
		for(i=1;i<=N;i++)
		{
				for(j=0;j<(N-i);j++)
				{
					System.out.print(" ");
				}
				for(k=1;k<(i*2);k++)
				{
					System.out.print("*");
				}		
				System.out.println();	
		}

	}

}
