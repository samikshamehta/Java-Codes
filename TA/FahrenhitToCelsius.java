import java.util.*;
public class FahrenhitToCelsius {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
			int start=s.nextInt();
			int end=s.nextInt();
			int gap=s.nextInt();
			while(start<=end)
			{
			   int cel=(5*(start-32))/9;
				System.out.println(start+" "+cel);
				start=start+gap;
			}			
		}

	}
