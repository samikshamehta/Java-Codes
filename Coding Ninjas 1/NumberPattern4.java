import java.util.Scanner;


public class NumberPattern4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int row=1,col=N,i,X;
		while(row<=N)
		{
			i=1;
			X=col;
			while(X!=0)
			{
					System.out.print(i);
					i++;
					X--;
			}
			col--;
			row++;
			System.out.println();
		}
	}
}