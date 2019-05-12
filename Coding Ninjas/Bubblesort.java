import java.util.Scanner;
public class bubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		bsort(arr);
		
	}
	static void bsort(int[]arr)
	{
		int i,j,temp;
		
			for(i=1;i<arr.length;i++)
			{
				for(j=1;j<arr.length;j++)
					{
						if(arr[j-1]>arr[j])
						{
							temp=arr[j];
							arr[j]=arr[j-1];
							arr[j-1]=temp;
						}
						
					}
				
			}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
			
	}

}
