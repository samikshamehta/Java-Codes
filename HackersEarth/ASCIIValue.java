import java.util.Scanner;
public class ASCIIValue
{
    public static void main(String args[] ) throws Exception
	{
		Scanner s = new Scanner(System.in);
		String val=s.next();
		System.out.println((int)val.charAt(0));
	}
}
