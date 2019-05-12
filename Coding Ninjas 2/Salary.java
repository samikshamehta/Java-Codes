import java.util.Scanner;

public class Salary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int basic=s.nextInt();
		char grade=s.next().charAt(0);
		int allow=0;
		double hra=(basic*20.0)/100;
		double da=(basic*50.0)/100;
		double pf=(basic*11.0)/100;
		if(grade=='A')
		{
			allow=1700;
		}
		else
		{
			if(grade=='B')
			{
				allow=1500;
			}
			else
			{
				
					allow=1300;
				
			}
		}
		double t_sal=basic+hra+da+allow-pf;
		System.out.println(Math.round(t_sal));
	}
}					
