import java.util.Scanner;


public class BinaryToDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int temp,power=1,sum=0,i,mul=1;
		while(num!=0)
		{
			temp=num%10;
			num=num/10;
			for(i=power;i>0;i--)
			{
				mul=mul*2;
			}
			sum=sum+(temp*(mul/2));
			power++;
			mul=1;
			
		}
		System.out.println(sum);
	}

}
