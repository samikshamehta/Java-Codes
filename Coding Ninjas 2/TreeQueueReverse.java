import java.util.Scanner;
import java.util.LinkedList;


public class TreeQueueReverse {
	public static void main(String[] args) throws Exception
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			q.add(data);
		}
		reverseQueue(q);
	}
	public static void reverseQueue(LinkedList<Integer> q) {
		if(q.isEmpty())
		{
			return;
		}
		int temp=q.remove();
		reverseQueue(q);
		q.add(temp);
	}
}
