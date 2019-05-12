import java.util.Scanner;


public class ReverseOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int x=n,count=0,sum=0,i,mul=1,val;
		while(x!=0)
		{
			x=x/10;
			count++;
		}
		count=count-1;
		while(n!=0)
		{
			val=n%10;
			n=n/10;
			for(i=count;i>0;i--)
			{
				mul=mul*10;
			}
			count--;
			sum=sum+(val*mul);
			mul=1;
		}
		System.out.println(sum);

		
	}

}
