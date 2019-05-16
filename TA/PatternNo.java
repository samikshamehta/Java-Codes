import java.util.Scanner;


public class PatternNo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int i=1;
        while(i <= N)
        {
          int space=1;
	          while(space <= N-i)
	          {
	        	  System.out.print(" ");
	        	  space+=1;
	          }
	          int k=i;
	          int j=1;
	          while( j <= i)
	          {
	        	  System.out.print(k);
	        	  k+=1;
	        	  j+=1;
	          } 
        System.out.println();
       i+=1;
       }
    }
}
          
