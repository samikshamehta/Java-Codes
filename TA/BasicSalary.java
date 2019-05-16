import java.util.*;
public class BasicSalary {
	
		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			int totalsal; 
			double hra,da,pf;
			int basic=s.nextInt();
			char grade=s.next().charAt(0);
			
			hra=0.2*basic;
			da=0.5*basic;
			pf=0.11*basic;
			
			if (grade=='A') {
				double  allow=1700;
				totalsal=(int)(Math.round(basic+hra+da+allow-pf));
				System.out.println(totalsal);
				return;
				
			}else if(grade=='B') {
				 double allow =1500;
				totalsal=(int)(Math.round(basic+hra+da+allow-pf));
				System.out.println(totalsal);
	             return;
			}else if(grade=='C'){
				double  allow=1300;
				totalsal=(int)(Math.round(basic+hra+da+allow-pf));
				System.out.println(totalsal);
				return;
				 
			}
				
			 
			
		}

	}

