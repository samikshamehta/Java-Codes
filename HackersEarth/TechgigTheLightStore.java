import java.util.Scanner;


public class TechgigTheLightStore {
	public static void main(String args[])throws Exception
    {
		Scanner s= new Scanner(System.in);
		String str[]=new String[2];
		for(int i=0;i<2;i++)
		{
			str[i] = s.nextLine();
		}
		System.out.println( editDist( str[0] , str[1] , str[0].length(), str[1].length()));
    }
	static int min(int x,int y,int z)
    {
        if (x<=y && x<=z)
        	return x;
        if (y<=x && y<=z) 
        	return y;
        else 
        	return z;
    } 
    static int editDist(String str1,String str2,int m,int n)
    {
       if (m == 0) 
    	   return n;
       if (n == 0) 
    	   return m;
       if (str1.charAt(m-1) == str2.charAt(n-1))
    	   return editDist(str1,str2,m-1,n-1);
       return 1 + min(editDist(str1,str2,m,n-1),editDist(str1,str2,m-1,n),editDist(str1,str2,m-1,n-1));
    } 
}
