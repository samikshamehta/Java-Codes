import java.util.Scanner;
public class MonkAtGraphFactory {
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		int V=s.nextInt();
		int d[]=new int[V];
		int sum=0;
		for(int i=0;i<V;i++)
		{
			d[i]=s.nextInt();
			sum=sum+d[i];
		}
		if(sum==2*(V-1))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}