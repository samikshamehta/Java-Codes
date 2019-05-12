import java.util.Scanner;


public class QuadraticEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=((b*b) - (4*a*c));
		if(d>0)
		{
			System.out.println("1");
			double root1=(-b + Math.sqrt(d))/(2*a);
			double root2=(-b - Math.sqrt(d))/(2*a);
			
			System.out.println(Math.round(root1)+ " "+Math.round(root2));
		}
		else
		{
			if(d<0)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println("0");
				double root1=(-b + Math.sqrt(d))/(2*a);
				double root2=(-b - Math.sqrt(d))/(2*a);
				
				System.out.println(Math.round(root1)+ " "+Math.round(root2));
			}
		}
		
	}
}
