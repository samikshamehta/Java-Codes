import java.util.Scanner;


public class RecursiveAllIndexOfNumber {

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
		int x=s.nextInt();
		int ans[]=allIndexes(arr,x);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
	public static int[] allIndexes(int input[], int x) {
		int index=0;
		int ans[]=AllIndexes(input,x,index);
		return ans;
		}
	public static int[] AllIndexes(int input[],int x,int index)
	{
		if(input.length ==index)
		{
			int ans[]={};
			return ans;
		}
		int smallAns[]= AllIndexes(input,x, index+1);
		if(input[index]!=x)
		{
				return smallAns;
		}
		int answer[]=new int[smallAns.length+1];
		answer[0]=index;
		for(int i=0;i<smallAns.length;i++)
		{
			answer[i+1]=smallAns[i];
		}
		return answer;
	}
}