import java.util.Scanner;


public class SortBinaryArray {

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
		sortBinaryArray(arr);
	}
	public static void sortBinaryArray(int[] arr){
  int i,j,count=0;
  for(i=0;i<arr.length;i++)
  {
	  if(arr[i]==0)
	  {
		  count++;
	  }
  }
  for(i=0;i<count;i++)
   {
  		arr[i]=0;
   }
  for(j=count;j<arr.length;j++)
  {
	  arr[j]=1;
  }
  for(i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	}
}