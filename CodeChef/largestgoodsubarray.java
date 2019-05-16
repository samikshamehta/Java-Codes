import java.util.Scanner;


public class largestgoodsubarray {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int t=s.nextInt();
	for(int i=0;i<t;i++)
	{
		int n=s.nextInt();
		int a[]=new int[n];
		for(int j=0;j<n;j++)
		{
			a[j]=s.nextInt();
		}
		int max=0, flag=0;
		for(int j=0;j<=n/2;j++)
		{
			for(int k=n-1;k>=n/2;k--)
			{
				if(a[j]>=a[k])
				{
					if(max<(k-j)+1)
					{
						max=(k-j)+1;
						flag=1;
						break;
					}
				}
			}
		}
		if(flag==0)
		{
			int flag1=0;
			for(int j=0;j<n/2;j++)
			{
				for(int k=n/2;k>=0;k--)
				{
					if(a[j]>=a[k])
					{
						if(max<(k-j)+1)
						{
							max=(k-j)+1;
							flag1=1;
							break;
						}
					}
				}
			}
			if(flag1==0)
			{
				for(int j=n/2;j<n;j++)
				{
					for(int k=n-1;k>n/2;k--)
					{
						if(a[j]>=a[k])
						{
							if(max<(k-j)+1)
							{
								max=(k-j)+1;
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}}
