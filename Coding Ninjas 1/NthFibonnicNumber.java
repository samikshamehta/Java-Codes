import java.util.Scanner;


public class NthFibonnicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int i=0,j=1,l,count=0;
		while(count<=N)
		{
			l=i;
			i=j;
			j=l+j;
			count++;
			if(count==N)
			{
				System.out.println(i);
			}
				
		}
	}
}