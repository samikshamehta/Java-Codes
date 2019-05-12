import java.util.Scanner;


public class ReverseLL {

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
		head=reverse_I(head);
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
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) 
	{
		LinkedListNode<Integer> prev=null;
		while(head!=null)
		{
			LinkedListNode<Integer> temp=head.next;
			head.next=prev;
			prev=head;
			head=temp;
			
		}
		return prev;
	}

}