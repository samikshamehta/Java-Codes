import java.util.Scanner;


public class MergeTwoSortedLL {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n1=s.nextInt();
		LinkedListNode<Integer> head1=null;
		for(int i=0;i<n1;i++)
		{
			int data=s.nextInt();
			head1=create(head1,data);
		}
		printRec(head1);
		System.out.println();
		int n2=s.nextInt();
		LinkedListNode<Integer> head2=null;
		for(int i=0;i<n2;i++)
		{
			int data=s.nextInt();
			head2=create(head2,data);
		}
		printRec(head2);
		System.out.println();
		LinkedListNode<Integer> head=null;
		head=mergeTwoList(head1,head2);
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
	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2)
	{
		LinkedListNode<Integer> head=null,tail=null,temp=head1;;
		int i=0;
		while(temp!=null)
		{
			if(head2!=null || head1!=null)
			{
				if(i==0)
				{
					if(head1.data<=head2.data)
					{
						head=head1;
						head1=head1.next;
						tail=head;
					}
					else
					{
						head=head2;
						head2=head2.next;
						tail=head;
					}
					i++;
				}
				else
				{
					if(head1.data<=head2.data)
					{
							head.next=head1;
							head1=head1.next;
							head=head.next;
					}
					else
					{
						head.next=head2;
						head2=head2.next;
						head=head.next;
					}
				}
			}
			if(head2==null)
			{
				head.next=head1;
				temp=null;
			}
			if(head1==null)
			{
				head.next=head2;
				temp=null;
			}
		}
		return tail;
	}
}