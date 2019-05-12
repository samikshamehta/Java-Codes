import java.util.Scanner;


public class NewTestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int val=s.nextInt();
			int arr[]=new int[val];
			arr[0]=1;
			arr[1]=6;
			for(int j=2;j<val;j++)
			{
				arr[j]=(2*(arr[j-1]+2))-arr[j-2];
			}
			System.out.println(arr[val-1]);
		}
	}

}
