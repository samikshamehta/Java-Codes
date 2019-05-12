import java.util.Scanner;


public class pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int row=1,col,i;
		while(row<=N)
		{
			i=row;
			col=1;
			for(int j=0;j<(N-row);j++)
			{
				System.out.print(" ");
			}
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
