import java.util.Scanner;


public class StackandQueueNissan {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int tym=n-1;
		if(arr.length!=0 && k!=0)
		{
			while(k>0)
			{
				int sum=arr[0];
				for(int i=1;i<k;i++)
				{
					sum+=arr[i];
				}
				for(int j=n-1;j>tym;j--)
				{
					sum+=arr[j];
				}
				if(max<sum)
				{
					max=sum;
				}
				k--;
				tym--;
			}
			System.out.println(max);
		}
		else
		{
			System.out.println(0);
		}
		
	}
}
