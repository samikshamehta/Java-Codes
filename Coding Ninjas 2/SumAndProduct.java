import java.util.Scanner;


public class SumAndProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		int sum=0,product=1,i;
		switch(c)
		{
		case 1: for(i=1;i<=n;i++)
				{
					sum=sum+i;
				}
				System.out.println(sum);
				break;
		case 2: for(i=1;i<=n;i++)
				{
					product=product*i;
				}
				System.out.println(product);
				break;
		default:	System.out.println("-1");
		}
	}

}
