import java.util.Scanner;


public class ArrangeNumberInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		 int val[]=arrange(n);
		for(int i=0;i<n;i++)
		{
			System.out.print(val[i]+ " ");
		}
	}
	public static int[] arrange(int n){
	{	int start=0,end=n-1;
		int val[]=new int[n];
			for(int i=1;i<=n;i++)
			{
				if(i%2==0)
				{
					val[end--]=i;
				}
				else
				{
					val[start++]=i;
				}
			}
			return val;
	}
}
}