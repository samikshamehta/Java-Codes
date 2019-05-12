import java.util.Scanner;
public class patt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1,x,z,y;
		while(i<=n)
		{
			x=1;
			z=n-i+1;
			while(x<i)
			{
				System.out.print(z);
				z++;
				x++;
			}
			y=0;
			while(y<=n-i)
			{
				System.out.print(n);
				y++;
			}
			i++;
			System.out.println();
		}
	}
}
