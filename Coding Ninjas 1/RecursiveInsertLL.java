import java.util.Scanner;


public class RecursiveInsertLL {

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
		int data=s.nextInt();
		int pos=s.nextInt();
		head=insertR(head,data,pos);
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
	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos)
	{
		if(head!=null)
		{
			if(pos==0)
			{
				LinkedListNode<Integer>node=new LinkedListNode<Integer>(data);
				node.next=head;
				return node;
			}
			head.next=insertR(head.next, data, pos-1);
		}
			return head;
	}
}