import java.util.Scanner;


public class DeleteEveryNNodesLL {

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
		int M=s.nextInt();
		int N=s.nextInt();
		head=skipMdeleteN(head,M,N);
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
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N)
	{
		LinkedListNode<Integer>tail=head,prev=null;
		if(M==0)
		{
			return null;
		}
		while(head!=null)
		{
			for(int i=1;i<M && head!=null;i++)
			{
				head=head.next;
			}	
			if(head==null)
			{
				return tail;
			}
			prev=head.next;
			for(int j=1;j<=N && prev!=null;j++)
			{
				prev=prev.next;
			}
			head.next=prev;
			head=prev;	
		}
		return tail;
	}

}