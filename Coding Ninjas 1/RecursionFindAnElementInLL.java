import java.util.Scanner;


public class RecursionFindAnElementInLL {

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
		int result=indexOfNRec(head,data);
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
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) 
	{
		int count=0;
		int result=IndexOfNRec(head,n,count);
		return result;
	}
	public static int IndexOfNRec(LinkedListNode<Integer> head, int n,int count) 
	{
		try
		{
			if(head==null)
			{
				return -1;
			}
			if(head!=null)
			{
				if(head.data==n)
				{
					return count;
				}
				else
				{			
					return(IndexOfNRec(head.next,n,count+1));
				}
			}
		}
		catch(Exception e)
		{
			
		}
		return count;
	}
}
