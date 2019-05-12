import java.util.Scanner;


public class MidPointLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		LinkedListNode<Integer> tail=null;
		LinkedListNode<Integer> head=null;
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			tail=create(tail,data);
			if(i==0)
			{
				head=tail;
			}
		}
		printRec(head);
		System.out.println();
		int result=printMiddel(head);
		System.out.println(result);

	}
	public static <T>LinkedListNode<T> create (LinkedListNode<T> head, T data)
	  {
	    if (head == null)
	      return new LinkedListNode<T>(data);
	    else {
	      head.next = create(head.next, data);
	      return head;
	    }
	  }
	static <T>void printRec(LinkedListNode<T> head)
	{	
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+"-->");
		printRec(head.next);
	}
	public static int printMiddel(LinkedListNode<Integer> head) 
	{
		LinkedListNode<Integer>tail=head;
		int count=0;
		while(tail!=null)
		{
			tail=tail.next;
			count++;
		}
		int flag=count;
		count=count/2;
		while(count!=1)
		{
			head=head.next;
			count--;
		}
		if(flag%2==0)
		{
			return head.data;
		}
		return head.next.data;
	}

}