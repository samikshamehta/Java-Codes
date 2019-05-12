import java.util.Scanner;

public class linearsearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		int num=s.nextInt();
		// TODO Auto-generated method stub
		int ans=lsearch(array,num);
		System.out.println(ans);
	}
	static int lsearch(int[]array,int num)
	{
		int i;
		for(i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				return i;
			}
		}
		return -1;
	}

}
