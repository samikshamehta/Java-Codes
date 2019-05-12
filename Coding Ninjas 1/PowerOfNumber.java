import java.util.Scanner;

public class PowerOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int number=s.nextInt();
		int power=s.nextInt();
		int mul=1,i;
		for(i=1;i<=power;i++)
		{
			mul=mul*number;
		}
		System.out.println(mul);
	}

}
