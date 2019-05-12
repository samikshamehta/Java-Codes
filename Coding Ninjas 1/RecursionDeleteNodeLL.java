import java.util.Scanner;


public class RecursionDeleteNodeLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		LinkedListNode<Integer> head=null;
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			head=create(head,data);
		}
		printRec(head);
		System.out.println();
		int i=s.nextInt();
		head=deleteIthNodeRec(head,i);
		printRec(head);

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
	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i)
	{ 
		try
		{
			if(head!=null)
			{
				if(i==0)
				{
					head=head.next;
					return head;
				}
				else
				{
					if(i==1)
					{
						head.next=head.next.next;
						return head;
					}
					head.next=deleteIthNodeRec(head.next,i-1);
				}
			}
		}
		catch(Exception e)
		{
			return head;
		}
		return head;
	}
}