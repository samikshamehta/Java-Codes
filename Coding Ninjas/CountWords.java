import java.util.Scanner;


public class CountWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		int ans=countWords(str);
		System.out.print(ans);
	}
	public static int countWords(String str){
		int i,count=1;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		return count;
	}
}
