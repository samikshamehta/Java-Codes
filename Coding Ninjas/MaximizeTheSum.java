import java.util.Arrays;
import java.util.Scanner;


public class MaximizeTheSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n1=s.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
		}
		int n2=s.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=s.nextInt();
		}
		long ans=maximumSumPath(arr1,arr2);
		System.out.print(ans);
	}
	
	public static long maximumSumPath(int[] input1, int[] input2) {
		int i=0,j=0,sum=0,sum1=0,sum2=0;
		while(i<input1.length && j<input2.length)
		{
			if(input1[i]==input2[j])
			{
				sum1=sum1+input1[i];
				sum2=sum2+input2[j];
				if(sum1>sum2)
				{
					sum=sum+sum1;
					//System.out.println("sum when sum1>"+" "+sum);

				}
				else
				{
					sum=sum+sum2;
					//System.out.println("sum when sum2>"+" "+sum);

				}
				i++;
				j++;
				sum1=0;
				sum2=0;
			}
			else
			{
				if(input1[i]<input2[j])
				{
					sum1=sum1+input1[i];
					//System.out.println("sum1 in first conditions"+" "+sum1+ " "+input1[i]);
					i++;
				}
				else
				{
					sum2=sum2+input2[j];
					//System.out.println("sum2 in first conditions"+ " " +sum2+ " "+input2[j]);
					j++;
				}
			}
		}
		while(i<input1.length)
		{
			sum1=sum1+input1[i];
			//System.out.println("sum1 in while when no intersection"+ " " + sum1+ " "+input1[i]);
			//System.out.println(i+ " "+input1.length);
			i++;
		}
		while(j<input2.length)
		{
			sum2=sum2+input2[j];
			//System.out.println("sum2 in while when no intersection"+ " " + sum2+ " "+input2[j]);
			//System.out.println(j+ " "+input2.length);
			j++;
		}
		if(sum1>=sum2)
		{
			sum=sum+sum1;
			//System.out.println("sum at end when sum1>"+ " " +sum);
		}
		else
		{
			sum=sum+sum2;
			//System.out.println("sum at end when sum2>"+ " " +sum);

		}
		return sum;
	}
	
	
}
