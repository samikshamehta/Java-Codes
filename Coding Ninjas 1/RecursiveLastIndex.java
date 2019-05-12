import java.util.Scanner;


public class RecursiveLastIndex {

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
		int ans=lastIndex(arr,x);
		System.out.println(ans);
	}
	public static int lastIndex(int input[], int x) {
		int index=0;
		int ans=LastIndex(input,x,index);
		return ans;
		}
	public static int LastIndex(int input[],int x,int index)
	{
		if(input.length ==index){
		return -1;
	}
		int smallAns= LastIndex(input,x, index+1);
		if(smallAns==-1)
		{
			if(input[index]==x)
			{
				return index;
			}
		}
	return smallAns;
	}
}