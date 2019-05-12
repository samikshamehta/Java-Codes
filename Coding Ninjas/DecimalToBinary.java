import java.util.Scanner;


public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		long binary[] = new long[200];
		 int i = 0;
	     while(num > 0){
	       binary[i++] = num%2;
	       num = num/2;
	     }
	     for(int j = i-1;j >= 0;j--){
	       System.out.print(binary[j]);
	     }
	  }
		
	}
