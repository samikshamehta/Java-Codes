import java.util.Scanner;


public class CheckNumberSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int first=s.nextInt();
		int second=0;
		int third=0;
		int flag=0,i;
		if(num==1)
		{
			System.out.println("true");
		}
		if(num==2)
		{
			second=s.nextInt();
			System.out.println("true");
		}
		if(num==3)
		{
			second=s.nextInt();
			third=s.nextInt();
			if(first-second<0 && second-third>0)
			{
				flag=1;
			}		
		}
		else
		{
			second=s.nextInt();
			third=s.nextInt();
//			System.out.println("first"+" "+ first+ " "+"second"+ " "+second+ " "+"third"+" "+third);
			System.out.println("num"+" "+num);
			i=3;
			while(i<=num+1)
			{
				System.out.println("hi"+" "+i);
				if(first-second<0 && second-third>0)
				{
					System.out.println("first"+" "+ first+ " "+"second"+ " "+second+ " "+"third"+" "+third+ " "+flag);
					flag=1;
					break;
				}
				else
				{
					if(i!=num)
					{
						first=second;
						second=third;
						third=s.nextInt();
						System.out.println("first"+" "+ first+ " "+"second"+ " "+second+ " "+"third"+" "+third+" "+"new"+" "+i);
						i++;
					}
					else
					{
						break;
					}
				}
			}
		}
			System.out.println("flag"+" "+flag);
			if(flag==0)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		
	}
}