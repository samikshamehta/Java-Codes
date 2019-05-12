import java.util.Scanner;


public class PlayWithNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int q=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=1;i<=q;i++)
		{
			int first=s.nextInt();
			int last=s.nextInt();
			System.out.println((first+last)/2);
		}
	}

}
