import java.util.Scanner;


public class PlusPlus {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		/*int dp[][]=new int[n][m];
		int I=-120,II=-120,sum = 0;
		int x1 = 0,y1 = 0,x2=0,y2=0;*/
		int comp=0,sum=0;
		for(int i=1;i<n-1;i++)
		{
			for(int j=1;j<m-1;j++)
			{
				for(int k=1;k<n-1;k++)
				{
					for(int l=1;l<m-1;l++)
					{
						if((k+l)-(i+j)>2)
						{
							System.out.print(a[i][j]+" "+a[k][l]+" "+a[i-1][j]+" "+a[k-1][l]+" "+a[i+1][j]+" "+a[k+1][l]+" "+a[i][j-1]+" "+a[k][l-1]+" "+a[i][j+1]+" "+a[k][l+1]);
							sum=(a[i][j]*a[k][l])+(a[i-1][j]*a[k-1][l])+(a[i+1][j]*a[k+1][l])+(a[i][j-1]*a[k][l-1])+(a[i][j+1]*a[k][l+1]);
							System.out.println("="+sum+"="+i+" "+j+" "+k+" "+" "+l);
						}
					}
					if(sum>comp)
					{
						comp=sum;
					}
					sum=0;
				}
				for(int k=2;k<n-1;k++)
				{
					for(int l=1;l<m-1;l++)
					{
						if(k>l && (k+l)!=((i+j)+2) && (k+l)-(i+j)>=2)
						{
							System.out.print(a[i][j]+" "+a[k][l]+" "+a[i-1][j]+" "+a[k-1][l]+" "+a[i+1][j]+" "+a[k+1][l]+" "+a[i][j-1]+" "+a[k][l-1]+" "+a[i][j+1]+" "+a[k][l+1]);
							sum=(a[i][j]*a[k][l])+(a[i-1][j]*a[k-1][l])+(a[i+1][j]*a[k+1][l])+(a[i][j-1]*a[k][l-1])+(a[i][j+1]*a[k][l+1]);
							System.out.println("="+sum+"="+i+" "+j+" "+k+" "+" "+l);
						}
						if(sum>comp)
						{
							comp=sum;
						}
						sum=0;
					}
				}
			}
		}
		System.out.println(comp);
	}
}
				/*dp[i][j]=sum;
				if(I<sum)
				{
					II=I;
					I=sum;
					x1=i;
					y1=j;
				}
				if(I>sum && sum>II && ((i+j)-(x1+y1))>=3)
				{
					II=sum;
					x2=i;
					y2=j;
				}
			}
			
			sum=0;
		}
	}
}*/
