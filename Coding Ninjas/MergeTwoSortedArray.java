import java.util.Scanner;
public class MergeTwoSortedArray 
{
	public static void main(String[] args) 
	{
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
		int val[]=merge(arr1,arr2);
		for(int i=0;i<arr1.length+arr2.length;i++)
		{
			System.out.print(val[i]+ " ");
		}
		
	}
	public static int[] merge(int arr1[], int arr2[])
	{
		int k=0,temp;
		int val[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			val[i]=arr1[i];
		}
		for(int j=arr1.length;j<arr1.length+arr2.length;j++)
		{
			val[j]=arr2[k++];
		}
		for(int i=1;i<val.length;i++)
		{
			for(int j=1;j<val.length;j++)
			{
				if(val[j-1]>val[j])
				{
					temp=val[j];
					val[j]=val[j-1];
					val[j-1]=temp;
				}
			}
		}
		return val;
	}
}
	