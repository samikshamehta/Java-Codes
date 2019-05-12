import java.util.Scanner;


public class EliminateDuplicateFromLL {

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
		System.out.println();
		head=removeDuplicates(head);
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
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head)
	{
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> newtemp=head;
		while(temp!=null)
		{
			if(newtemp.data.equals(temp.data))
			{
				temp=temp.next;
			}
			else
			{
				newtemp.next=temp;
				newtemp=newtemp.next;	
			}
		}
		if(temp==null)
		{
			newtemp.next=temp;
		}
		return head;
	}

}
