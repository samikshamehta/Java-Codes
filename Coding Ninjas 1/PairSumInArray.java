import java.util.Scanner;


public class PairSumInArray {

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
		int num=s.nextInt();
		pairSum(arr,num);
	}
	public static void pairSum(int[] arr, int num){
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==num)
				{
					if(arr[i]>arr[j])
					{
						System.out.println(arr[j]+ " "+arr[i]);
					}
					else
					{
						System.out.println(arr[i]+ " "+arr[j]);
					}
				}
			}
		}

	}
}
