import java.util.Scanner;


public class RecursionTowerOFHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		String rod="abc";
		char a=rod.charAt(0);
		char b=rod.charAt(1);
		char c=rod.charAt(2);
		towerOfHanoi(n, a, b, c); 
	}
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks==0)
		{
			return;
		}
		towerOfHanoi(disks-1, source,destination, auxiliary);
		System.out.println(source+" "+destination);
		towerOfHanoi(disks-1, auxiliary,source, destination);

		
	}

}
