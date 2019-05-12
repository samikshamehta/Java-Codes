import java.util.Scanner;


public class NthNodeFromLastLL {

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
		int pos=s.nextInt();
		LinkedListNode<Integer> result=nthNodeFromLastIter(head,pos);
		if(result==null)
		{
			System.out.println();
		}
		else
		{
			System.out.println(result.data);
		}
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
	public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n)
	{
		int count,length=0;
		LinkedListNode<Integer> tail=head;
		while(tail!=null)
		{
			tail=tail.next;
			length++;
		}
		count=(length-1)-n;
		head=NthNodeFromLastIter(head,count);
		return head;
	}
	public static LinkedListNode<Integer> NthNodeFromLastIter(LinkedListNode<Integer> head, int count)
	{
		if(head==null)
		{
			return null;
		}
		if(count==0)
		{
			return head;
		}
		return(NthNodeFromLastIter(head.next,count-1));		
	}
}
