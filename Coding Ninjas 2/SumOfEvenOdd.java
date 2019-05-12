import java.util.Scanner;


public class SumOfEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int even=0,odd=0,val;
		while(N!=0)
		{
			val=N%10;
			N=N/10;
			if((val%2)==0)
			{
				even=even+val;
			}
			else
			{
				odd=odd+val;
			}
		}
		System.out.print(even+ " "+odd);
		

	}

}
