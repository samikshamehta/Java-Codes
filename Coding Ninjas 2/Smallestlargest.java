import java.util.Scanner;


public class smallestlargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		// TODO Auto-generated method stub
		minmax(array);
	}
	static void minmax(int[]array)
	{
		int i;
		int min=array[0];
		int max=array[0];
		for(i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{ 
				min=array[i];
			}
			else
			{
				if(array[i]>max)
				{
					max=array[i];
				}
			}
		}
		System.out.println(min+ " "+max);
	}
}
		
				