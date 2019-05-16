import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LinearSearchMannasFirstName 
{
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[] ) throws Exception
	{
		String t=reader.readLine();
		int line=Integer.parseInt(t);
		String msg="";
		for(int i=0;i<line;i++)
		{
			String s=reader.readLine();
			s=s+" ";
			int suvo=0,suvojit=0;
			for(int j=0;j<s.length();j++)
			{				
					msg=msg+s.charAt(j);
					if(s.charAt(j)=='S'&& s.charAt(j+1)=='S')
					{
						msg="";
					}
					else
					{
						if(s.charAt(j)=='S' ||(s.charAt(j)=='U' && msg.charAt(0)=='S')||(s.charAt(j)=='V' && msg.charAt(0)=='S')||(s.charAt(j)=='O' && msg.charAt(0)=='S'))
						{
							
							if(msg.equals("SUVO") && j!=s.length()-1)
							{
								if(s.charAt(j+1)=='J' && j+2!=s.length()-1)
								{
									if(s.charAt(j+2)=='I' && j+3!=s.length()-1)
									{
										if(s.charAt(j+3)=='T')
										{
											suvojit=suvojit+1;
											j=j+3;
											msg="";
										}
										else
										{
											suvo=suvo+1;
											msg="";
										}
									}
									else
									{
										suvo=suvo+1;
										msg="";
									}
								}
								else
								{
									suvo=suvo+1;
									msg="";
								}
							}
						}
						else
						{
							msg="";
						}
					}
			}
			System.out.println("SUVO ="+" "+suvo+" "+"SUVOJIT ="+" "+suvojit);
		}
	}
}
			