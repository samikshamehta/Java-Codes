import java.util.Scanner;


public class binarysearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int num=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int ans=bsearch(arr,num);
		System.out.println(ans);
	}
	static int bsearch(int[]arr,int num)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{ 
			int mid=(start+end)/2;
			
			if(arr[mid]<num)
			{
				start=mid+1;
			}
			else
			{
				if(arr[mid]>num)
				{
					end=mid-1;
				}
				else
				{
					return mid;
				}
			}
		}
		return -1;		
	}
}