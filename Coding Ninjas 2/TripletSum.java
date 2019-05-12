import java.util.Scanner;


public class TripletSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		FindTriplet	(arr,x);
	}
	public static void FindTriplet(int[] arr, int x)
	{
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==x)
					{
						if(arr[i]>arr[j]&& arr[i]>arr[k])
						{
							if(arr[j]>arr[k])
							{
								System.out.println(arr[k]+ " "+arr[j]+ " "+arr[i]);
							}
							else
							{
								System.out.println(arr[j]+ " "+arr[k]+ " "+arr[i]);
							}
						}
						else
						{
							if(arr[j]>arr[i]&& arr[j]>arr[k])
							{
								if(arr[i]>arr[k])
								{
									System.out.println(arr[k]+ " "+arr[i]+ " "+arr[j]);
								}
								else
								{
									System.out.println(arr[i]+ " "+arr[k]+ " "+arr[j]);
								}
							}
							else
							{
								if(arr[k]>arr[i]&& arr[k]>arr[j])
								{
									if(arr[i]>arr[j])	
									{
										System.out.println(arr[j]+ " "+arr[i]+ " "+arr[k]);
									}
									else
									{
										System.out.println(arr[i]+ " "+arr[j]+ " "+arr[k]);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}