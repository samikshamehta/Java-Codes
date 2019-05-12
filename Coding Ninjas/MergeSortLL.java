import java.util.Scanner;


public class MergeSortLL {

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
		head=mergeSort(head);
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
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) 
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		LinkedListNode<Integer>mid=getMidNode(head);
		LinkedListNode<Integer>head1=mid.next;
		mid.next=null;
		head=mergeSort(head);
		head1=mergeSort(head1);
		return merge(head,head1);
	}
	public static LinkedListNode<Integer> getMidNode(LinkedListNode<Integer> head) 
	{
		LinkedListNode<Integer>fast=head.next,slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1,LinkedListNode<Integer>head2) 
	{
		LinkedListNode<Integer> head=null,tail=null,temp=head1;
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
		/*LinkedListNode<Integer>finalhead,finaltail;
		if(head1.data.compareTo(head2.data)<=0)
		{
			finalhead=head1;
			finaltail=head1;
			head1=head1.next;
		}
		else
		{
			finalhead=head2;
			finaltail=head2;
			head2=head2.next;
		}
		while(head1!=null && head2!=null)
			{
				if(head1.data.compareTo(head2.data)<=0)
				{
					finaltail.next=head1;
					head1=head1.next;
					finaltail=finaltail.next;
				}
				else
				{
					finaltail.next=head2;
					head2=head1.next;
					finaltail=finaltail.next;
				}
			}
		if(head2==null)
		{
			finaltail.next=head1;
		}
		if(head1==null)
		{
			finaltail.next=head2;
		}
		return finalhead;
	}*/

}
			