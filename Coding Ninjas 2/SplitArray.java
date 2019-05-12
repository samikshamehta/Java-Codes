import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++)
		{
			input[i]=s.nextInt();
		}
		boolean result= splitArray(input);
		System.out.println(result);
	}
	public static boolean splitArray(int input[])
	{
		int array5[]=new int[input.length];
		int array3[]=new int[input.length];
		int extra[]=new int[input.length];
		int k=0,l=0,m=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]%5==0)
			{
				array5[k++]=input[i];
			}
			else
			{
				if(input[i]%3==0)
				{
					array3[l++]=input[i];
				}
				else
				{
					extra[m++]=input[i];
				}
			}
		}
		Arrays.sort(extra);
		int sum5=0,sum3=0,temp;
		for(int r=0;r<array5.length;r++)
		{
			sum5=sum5+array5[r];
		}
		for(int s=0;s<array3.length;s++)
		{
			sum3=sum3+array3[s];
		}
		if(sum5>sum3)
		{
			temp=sum5-sum3;
			for(int r=0;r<extra.length;r++)
				{
					array3[l++]=extra[r];
					sum3=sum3+extra[r];
					if(sum3==sum5)
					{
						return true;
					}
				}			
		}
		else
		{
			temp=sum3-sum5;
			if(temp!=0)
			{
				for(int r=0;r<extra.length;r++)
				{
					array5[k++]=extra[r];
					sum5=sum5+extra[r];
					if(sum3==sum5)
					{
						return true;
					}
				}	
			}
			else
			{
				return false;
			}
		}
      return false;
	}
}
