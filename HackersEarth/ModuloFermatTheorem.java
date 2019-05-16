import java.util.Scanner;


public class ModuloFermatTheorem {
	public static void main(String[] args) throws Exception {
		Scanner s= new Scanner(System.in);
		long p=s.nextLong();
		long l=s.nextLong();
		long count=0,k=1;
		for(long x=1; x<p;x++)
		{
			for(long y=1;y<p;y++)
			{
				if(k<=l)
				{
					boolean flag=false;
					for(long z=1;z<p;z++)
					{
						if((((Math.pow(x, k))+(Math.pow(y, k)))-(Math.pow(z, k)))%p==0)
						{
							count++;
							flag=true;
							if(flag==true)
							{
								k++;
								break;
							}
						}
					}
					if(flag==false)
					{
						k++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
