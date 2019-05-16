import java.util.ArrayList;
import java.util.Scanner;


public class RatioNov {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			ArrayList<Character>arr=new ArrayList<>();
			ArrayList<Integer>number=new ArrayList<>();
			int sum=0;
			for(int j=0;j<n;j++)
			{
				int val=s.nextInt();
				sum+=val;
				number.add(val);
				String str=s.next();
				for(int k=0;k<val;k++)
				{
					arr.add(str.charAt(0));
				}
			}
			int count=0;
			if(number.get(0)<sum)
			{
				
			}
		}
	}
}
