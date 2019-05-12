import java.util.Scanner;


public class OptimizeSort01 {

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
		sort01(arr);
	}
	public static void sort01(int[] arr){
		int next=0;
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i]==0)
			  {
				  swap(arr[i],arr[next]);
				  next++;
			  }
		  }
	}

}
