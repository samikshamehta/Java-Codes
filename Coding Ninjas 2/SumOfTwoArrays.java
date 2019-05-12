import java.util.Scanner;


public class SumOfTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int value[]=sumOfTwoArrays(arr1,arr2);
		for(int i=0;i<value.length;i++)
		{
			System.out.print(value[i]+ " ");
		}
		

	}
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		int ans[] = new int[Math.max(arr1.length, arr2.length) + 1];
		
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = ans.length -1;
		int carry = 0;
		while( i >= 0 && j >= 0)
		{
			ans[k] = arr1[i] + arr2[j] + carry;
			if(ans[k] >= 10)
			{
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			ans[k] = ans[k] % 10;
			k--;
			i--;
			j--;
		}
		while( i >= 0)
		{
			ans[k] = arr1[i] + carry;
			if(ans[k] >= 10)
			{
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			ans[k]  = ans[k] %10;
			k--;
			i--;		
		}
		while( j >= 0)
		{
			ans[k] = arr2[j] + carry;
			if(ans[k] >= 10)
			{
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			ans[k]  = ans[k]%10;
			k--;
			j--;
		}
		ans[k] = carry;
		return ans;
	}
}