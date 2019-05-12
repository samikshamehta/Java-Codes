import java.util.Scanner;


public class FindUniqueElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[(2*n)+1];
		for(int i=0;i<n;i++)
		{
			input[i]=s.nextInt();
		}
		int val=findUnique(input);
		System.out.print(val);
	}
	public static int findUnique(int[] arr){
		int temp;
		int i,j,k,count=1;
		for(i=0;i<arr.length;i++)
		{	
			for(j=i+1;j<arr.length;j++)
			{ 
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			for(k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					count++;
				}
			}
			if(count==1)
			{
				return arr[i];
			}
			count=1;
		}
		return -1;
	}
}
