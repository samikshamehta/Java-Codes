import java.util.Scanner;


public class SortEvenOddLL {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
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
		head=sortEvenOdd(head);
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
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) 
	{
		if (head == null) 
		{ 
			return head; 
		} 
		LinkedListNode<Integer> evenHead = null, oddHead = null, evenTail = null, oddTail = null; 
		while (head != null) 
		{ 
			if (head.data % 2 == 0) 
			{ 
				if (evenHead == null) 
				{ 
					evenHead = head; 
					evenTail = head; 
				} 
				else 
				{ 
					evenTail.next = head; 
					evenTail = evenTail.next; 
				} 
			} 
			else 
			{ 
				if (oddHead == null) 
				{ 
					oddHead = head; 
					oddTail = head; 
				} 
				else 
				{ 
					oddTail.next = head; 
					oddTail = oddTail.next; 
				} 
			} 
			head = head.next; 
		} 
		if (oddHead == null) 
		{ 
			return evenHead; 
		} 
		else 
		{ 
			oddTail.next = evenHead; 
		} 
		if (evenHead != null) 
		{ 
			evenTail.next = null; 
		} 
		return oddHead; 
	} 
}