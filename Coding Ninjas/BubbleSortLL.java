import java.util.Scanner;


public class BubbleSortLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		head=bubbleSort(head);
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
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		LinkedListNode<Integer> tail=head;
		int count=0;
		while(tail.next!=null)
		{
			tail=tail.next;
			count++;
		}
		for(int i=0;i<count-1;i++)
		{
			LinkedListNode<Integer>prev=null,extra=null;
			LinkedListNode<Integer>current=head;
			for(int j=0;j<count-i;j++)
			{
				if(current.data.compareTo(current.next.data)>0)
				{
					if(prev==null)
					{
						head=current.next;
						extra=current.next.next;
						current.next.next=current;
						current.next=extra;
						prev=head;
						
					}
					else
					{
						extra=current.next.next;
						current.next.next=current;
						prev.next=current.next;
						current.next=extra;
						prev=prev.next;
					}
				}
				else
				{
					prev=current;
					current=current.next;
				}
				
			}	
		}
		return head;
	}
}
