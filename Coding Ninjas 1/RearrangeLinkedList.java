import java.util.Scanner;


public class RearrangeLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		ListNode<Integer> head=null;
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			head=create(head,data);
		}
		printRec(head);
		System.out.println();
		head=changelist(head);
		printRec(head);
	}
	public static <T>ListNode<T> create (ListNode<T> head, T data)
	  {
	    if (head == null)
	      return new ListNode<T>(data);
	    else {
	      head.next = create(head.next, data);
	      return head;
	    }
	  }
	static <T>void printRec(ListNode<T> head)
	{	
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+"-->");
		printRec(head.next);
	}
	public static ListNode<Integer> changelist(ListNode<Integer> head)
	{
		ListNode<Integer>head2,head1,tail=head;
		int count=0;
		while(head!=null)
		{
			head=head.next;
			count++;
		}
		head1=tail;
		ListNode<Integer>mid=getMidNode(head1);
		head2=mid.next;
		mid.next=null;
		head2=Reverse_R(head2,null);
		for(int i=0;i<count;i++)
		{
			if(head1!=null || head2!=null)
			{
				if(i==0)
				{
					head=head1;
					head1=head1.next;
				}
				else
				{
					if(i%2==0)
					{
						head.next=head1;
						head1=head1.next;
					}
					else
					{
						head.next=head2;
						head2=head2.next;
					}
					head=head.next;
				}
			}
		}
		System.out.println();
		return tail;
	}
	public static ListNode<Integer> Reverse_R(ListNode<Integer> head, ListNode<Integer> prev)
	{
		if(head==null)
		{
			return prev;
		}
		ListNode<Integer> temp=head.next;
		head.next=prev;
		return Reverse_R(temp,head);
	}
	public static ListNode<Integer> getMidNode(ListNode<Integer> head) 
	{
		ListNode<Integer>fast=head.next,slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
}