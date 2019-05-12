import java.util.Scanner;

public class fact {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int number=s.nextInt();
		int i,value=0;
		for(i=5;number/i>=1;i=i*5)
		{
			value=value+number/i;
		}
		System.out.println(value);
	}

}