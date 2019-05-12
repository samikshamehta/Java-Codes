import java.util.Scanner;


public class sqt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		sqrt(n);
		
	}
static void sqrt(int n)
{
	int i=2;
	while((i*i)<=n)
	{
		i++;
		continue;
	}
	System.out.print(--i);
}
}
