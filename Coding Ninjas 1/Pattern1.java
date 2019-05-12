import java.util.Scanner;


public class pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int row=1,col,i;
		while(row<=N)
		{
			i=row;
			col=1;
			while(col<=row)
			{
					System.out.print(i);
					col++;
					i++;
			}
			System.out.println();
			row++;
			
		}
	}
}