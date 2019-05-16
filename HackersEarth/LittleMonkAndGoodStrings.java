import java.util.Scanner;


public class LittleMonkAndGoodStrings
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		char arr[]={'a','e','i','o','u'};
		int count=0,max=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=str.length())
				{
					if(str.charAt(i)==arr[j])
					{
						count++;
						if(count>max)
						{
							max=count;
						}
						i++;
						j=-1;
					}
				}
			}
			count=0;
		}
		System.out.println(max);
	}
}
