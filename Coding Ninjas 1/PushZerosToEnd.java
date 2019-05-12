import java.util.Scanner;


public class PushZerosToEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		pushZerosAtEnd(arr);
	}
	public static void pushZerosAtEnd(int[] arr){
		int i,k=0;
		for(i=0;i<arr.length;i++)
		  {
			  if(arr[i]!=0)
			  {
				arr[k++]=arr[i];
			  }
		  }
		  for(i=k;i<arr.length;i++)
		  {
			  arr[i]=0;
		  }			  
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
