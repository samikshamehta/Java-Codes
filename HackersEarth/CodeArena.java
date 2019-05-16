import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class CodeArena {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			String k=s.nextLine();
			int n=Integer.parseInt(k);
			String days=s.nextLine();
			String[] day=days.split(" ");
			ArrayList<Integer>b=new ArrayList<>();
			for(int i=0;i<day.length;i++)
			{
				b.add(Integer.parseInt(day[i]));
			}
			Collections.sort(b);
			int dem=1;
			int kq1=0,kq;
			for(int i=0;i<b.size();i++)
			{
				kq=i+2+dem;
				dem+=1;
				if(kq>kq1)
				{
					kq1=kq;
				}
			}
			System.out.println(kq1);
}
}
