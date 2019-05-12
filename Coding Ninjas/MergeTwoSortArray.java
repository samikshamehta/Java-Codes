import java.util.Scanner;


public class MergeTwoSortArray {

	/**
	 * @param args
	 */
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
		{
		 	int[] val = new int[arr1.length + arr2.length];
		    int i = 0, j = 0, k = 0;
		    while (i < arr1.length && j < arr2.length)
		    {
		        if (arr1[i] < arr2[j])
		        {
		            val[k] = arr1[i];
		            i++;
		        }
		        else
		        {
		            val[k] = arr2[j];
		            j++;
		        }
		        k++;
		    }

		    while (i < arr1.length)
		    {
		        val[k] = arr1[i];
		        i++;
		        k++;
		    }

		    while (j < arr2.length)
		    {
		        val[k] = arr2[j];
		        j++;
		        k++;
		    }

		    return val;
		}
}
}