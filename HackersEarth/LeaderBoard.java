import java.awt.List;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;


public class LeaderBoard {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		String name[] = new String[n];
		int time[]=new int[n];
		Map<String,Integer>hashname=new HashMap<>();
		Map<String,Integer>hashtime=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			name[i]=s.next();
			time[i]=s.nextInt();
			if(hashname.containsKey(name[i]))
			{
				hashname.put(name[i], hashname.get(name[i])+1);
			}
			else
			{
				hashname.put(name[i],1);
			}
			if(hashtime.containsKey(name[i]))
			{
				hashtime.put(name[i], hashtime.get(name[i])+time[i]);
			}
			else
			{
				hashtime.put(name[i],time[i]);
			}
		}
		
	}
}
