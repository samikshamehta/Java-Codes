import java.util.Scanner;


public class RecursiveBinarySearch {

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
		int x=s.nextInt();
		int ans=binarySearch(arr,x);
		System.out.println(ans);
	}
	public static int binarySearch(int input[], int element) {
		int start=0,end=input.length-1;
		int ans=BinarySearch(input,element,start,end);
		return ans;
	}
	public static int BinarySearch(int input[], int element,int start,int end) {
		int mid=(start+end)/2;
		if(start>end)
		{
			return -1;
		}
		
		if(input[mid] == element){
			return mid;
		}
		
		else if(input[mid]<element)
		{
			return BinarySearch(input, element,mid+1,end);
		}
		else
			return BinarySearch(input, element,start,mid-1);
	}
}