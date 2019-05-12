import java.util.Scanner;


public class FahereniteToCelsius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int size=s.nextInt();
		int i;
		int celsius;
		for(i=start;i<=end;i=i+size)
		{
			celsius=(int)((5.0/9)*(i-32));
			System.out.println(i+ " "+celsius);
		}
		
	}

}
