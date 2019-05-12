import java.util.Scanner;

class Queue<T> {

	public int size();

	public boolean isEmpty();

	public T front();

	public void enqueue(T element);

	public T dequeue();
}
public class QueueReverse 
{
	public static void main(String[] args) throws Exception
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		Queue<Integer> q=new Queue<Integer>(n);
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			q.enqueue(data);
		}
		reverseQueue(q);
	}
	public static void reverseQueue(Queue<Integer> q)
	{
		if(q.isEmpty())
		{
			return;
		}
		int temp=q.dequeue();
		reverseQueue(q);
		q.enqueue(temp);
	}
}