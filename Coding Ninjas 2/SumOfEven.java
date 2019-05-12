import java.util.Scanner;
public class SumOfEven {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int sum=0;
		for(int i=2;i<=N;i=i+2)
		{
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
