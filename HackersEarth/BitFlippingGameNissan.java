import java.util.Scanner;


public class BitFlippingGameNissan {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[][]=new int[n][];
		int count=0;
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			arr[i]=new int[str.length()];
			for(int j=0;j<str.length();j++)
			{
				arr[i][j]=str.charAt(j)-'0';
				if(arr[i][j]==1)
				{
					count++;
				}
			}
		}
		int moves=0,j=0,k=0;;
		while(count>0)
		{
			for(int i=k;i<arr.length;i++)
			{
				boolean flag=false;
				while(i<n)
				{
					if(j<arr[i].length)
					{
						if(arr[i][j]==1)
						{
							if(flag==false)
							{
								moves++;
								flag=true;
							}
							arr[i][j]=0;
							count--;
						}
					}
					i++;
				}
				j++;
			}
		}
		if(moves%2==0)
		{
			System.out.println("B");
			System.out.println(moves);
		}
		else
		{
			System.out.println("A");
			System.out.println(moves);
		}
	}
}