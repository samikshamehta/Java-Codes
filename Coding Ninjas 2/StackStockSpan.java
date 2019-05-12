import java.util.Scanner;
import java.math.*;


public class StackStockSpan 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int[] ans=stockSpan(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]);
		}
	}
 public static int[] stockSpan(int[] price)
 {
	 int a[]=new int[price.length];
     a[0]=1;
     for(int i=1;i<price.length;i++)
     {   
      	 int count=1;
      	 for(int j=i-1;j>=0;j--)
         {
         	 if(price[j]<price[i])
          	 {
          		 count++;
           	 }
             else
             {
            	 break;
             }
         }
         a[i]=count;
     }
    return a;  

}
}
