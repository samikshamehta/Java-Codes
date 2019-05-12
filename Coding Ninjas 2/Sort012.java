import java.util.Scanner;


public class Sort012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		sort012(arr);
	}
	public static void sort012(int[] arr){
		  int i,j,k,count0=0,count1=0;
		  for(i=0;i<arr.length;i++)
		  {
			  if(arr[i]==0)
			  {
				  count0++;
			  }
			  else
			  {
				  if(arr[i]==1)
				  {
					  count1++;
				  }
			  }
		  }
		  for(i=0;i<count0;i++)
		   {
		  		arr[i]=0;
		   }
		  for(j=count0;j<(count0+count1);j++)
		  {
			  arr[j]=1;
		  }
		  for(k=(count0+count1);k<arr.length;k++)
		  {
			  arr[k]=2;
		  }
		  for(i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+ " ");
			}
	}
}