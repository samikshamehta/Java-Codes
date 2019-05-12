import java.util.Scanner;


public class DynammicProgrammingNumberOfBalancedBinaryTree {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int h=s.nextInt();
		int ans=balancedTreesOfHeightH(h);
		System.out.println(ans);
		
	}
public static int balancedTreesOfHeightH(int height)
{ 
	if(height == 0)
	{ 
		return 1; 
	} 
	int arr[] = new int[height + 1]; 
	arr[0] = arr[1] = 1; 
	int mod = (int) Math.pow(10, 9) + 7; 
	for(int i = 2; i <= height; i++)
	{ 
		long temp1 = (long) (arr[i- 1]) * arr[ i - 1]; 
		temp1 = temp1 % mod; 
		long temp2 = 2 * (long) (arr[i - 1]) * arr[ i - 2]; 
		temp2 = temp2 % mod; 
		arr[i] = (int) (temp1 + temp2) % mod; 
	} 
	return arr[height]; 
	} 
}