import java.util.Scanner;


public class FindANodeInLL {

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
		int result=indexOfNIter(head,data);
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
	public static int indexOfNIter(LinkedListNode<Integer> head, int n) 
	{
		int count=0;
		try
		{
			while(head!=null)
			{
				if(head.data==n)
				{
					return count;
				}
				else
				{			
					head=head.next;
					count=count+1;
				}
			}
			if(head==null)
			{
				return -1;
			}
		}
		catch(Exception e)
		{
			
		}
		return count;
	}
}
