import java.util.Scanner;
class fibonnicseries 
{
	 public static void main(String args[]) throws Exception 
	{	
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int i=0,j=1,l;
		while(i<N)
		{
			l=i;
			i=j;
			j=l+j;
		}
		if(i!=N)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}
}