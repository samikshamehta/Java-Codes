import java.util.ArrayList;
import java.util.Scanner;
public class GridAndPhase {
	public static void main(String[] args)throws Exception {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		char array[][]=new char[n][m];
		ArrayList<Integer> k=new ArrayList<Integer>();
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			String msg=s.next();
			if(msg.length()==m)
			{
				for(int j=0;j<msg.length();j++)
				{
					array[i][j]=msg.charAt(j);
					if(msg.charAt(j)=='s')
					{
						k.add(i);
						l.add(j);
					}
				}
			}
			else
			{
				i--;
			}
		}
		int result=calculate(array,k,l,n,m);
		System.out.println(result);
	}
	public static int calculate(char array[][],ArrayList<Integer>k,ArrayList<Integer>l,int n,int m){
		int count=0;
		for(int r=0;r<k.size();r++)
		{
			if(array[k.get(r)][l.get(r)]=='s')
				{
					if(l.get(r)+3<=m)
					{
						if(array[k.get(r)][l.get(r)+1]=='a' && array[k.get(r)][l.get(r)+2]=='b' && array[k.get(r)][l.get(r)+3]=='a')
						{
							count++;
						}
					}
					if(k.get(r)+3<=n)
					{
						if(array[k.get(r)+1][l.get(r)]=='a' && array[k.get(r)+2][l.get(r)]=='b' && array[k.get(r)+3][l.get(r)]=='a')
						{
							count++;
						}
					}
					if(k.get(r)+3<=n && l.get(r)+3<=m)
					{
						if(array[k.get(r)+1][l.get(r)+1]=='a' && array[k.get(r)+2][l.get(r)+2]=='b' && array[k.get(r)+3][l.get(r)+3]=='a')
						{
							count++;
						}
					}
					if(k.get(r)-3>=0 && l.get(r)+3<=m)
					{
						if(array[k.get(r)-1][l.get(r)+1]=='a' && array[k.get(r)-2][l.get(r)+2]=='b' && array[k.get(r)-3][l.get(r)+3]=='a')
						{
							count++;
						}
					}
				}
			}
		return count;
	}
}
