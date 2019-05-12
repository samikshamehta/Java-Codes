import java.util.Scanner;


public class RecursiveStringToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		int c= convertStringToInt(str);
		System.out.println(c);
	}
	public static int convertStringToInt(String input){
		 if(input.length()==0)
		    {
		        return 0;
		    }
		    char cc = input.charAt(0);
		    String ros = input.substring(1);

		    int factor=1;
		    for(int i=0;i<input.length()-1;i++)
		    {
		        factor*=10;
		    }
		    factor=factor*(cc-'0');
		    return factor+convertStringToInt(ros);
	}
}