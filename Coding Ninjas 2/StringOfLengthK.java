import java.util.Scanner;


public class StringOfLengthK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String S=s.next();
		int k=s.nextInt();
		String result[]=allStrings(S,k);
		for(String r:result)
		{
			System.out.println(r);
		}
		
	}
	public static String[] allStrings(String S, int k)
	{
		String arr[]=new String[S.length()];
		for(int i=0;i<S.length();i++)
		{
			arr[i]=String.valueOf((S.charAt(i)));
		}
		String result[]=AllStrings(arr,k);
		return result;
	}
	public static String[] AllStrings(String arr[], int k)
	{
		if(k==1)
		{
			return arr;
		}
		String smallArray[]=AllStrings(arr,k-1);
		String result[]=new String[arr.length*smallArray.length];
		int l=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<smallArray.length;j++)
			{
				result[l]=arr[i]+smallArray[j];
				l++;
			}
		}
		return result;
	}

}
