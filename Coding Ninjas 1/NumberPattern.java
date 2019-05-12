import java.util.Scanner;

public class NumberPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int row=1,col,i,X;
		while(row<=N)
		{
			i=1;
			col=1;
			while(col<=row)
			{
					System.out.print(i);
					col++;
			}
			System.out.println();
			row++;
			
		}
	}
}
