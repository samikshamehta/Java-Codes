import java.util.HashMap;
import java.util.Scanner;


public class ModuleFermatsT {
	public static void main(String[] args) throws Exception {
		Scanner s= new Scanner(System.in);
		long P=s.nextLong();
		long L=s.nextLong();
		long count=0;
		for(long k=1;k<=L;k++)
		{
			boolean flag=false;
			for(long x=1; x<P;x++)
			{
				for(long y=1;y<P;y++)
				{
					for(long z=1;z<P;z++)
					{
							if((((Math.pow(x, k))+(Math.pow(y, k)))%P)==((Math.pow(z, k)) %P))
							{
								count++;
								flag=true;
								System.out.println(k);
								System.out.println(x+" "+y+" "+z);
								break;
								/*if(flag==true)
								{
									break;
								}*/
							}
					}
					if(flag==true)
					{
						break;
					}
				}
				if(flag==true)
				{
					break;
				}
			}
		}
		System.out.println(count);
	}
}

