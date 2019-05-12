import java.util.Scanner;


public class TermOfAP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1,count=0,val;
		while(count<n)
		{
			val=(3*i)+2;
			if(val%4!=0)
			{
				System.out.print(val+ " ");
				count++;
			}
			i++;
		}
	}

}
