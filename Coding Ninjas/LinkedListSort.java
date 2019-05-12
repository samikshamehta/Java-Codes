import java.util.Scanner;


public class LinkedListSort {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		Node<Integer> head=null;
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			head=create(head,data);
		}
		printRec(head);
		System.out.println();
		head=sort(head);
		printRec(head);
	}
	public static <T>Node<T> create (Node<T> head, T data)
	  {
	    if (head == null)
	      return new Node<T>(data);
	    else {
	      head.next = create(head.next, data);
	      return head;
	    }
	  }
	static <T>void printRec(Node<T> head)
	{	
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+"-->");
		printRec(head.next);
	}
	public static Node<Integer> sort(Node<Integer> head) 
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer>mid=getMidNode(head);
		Node<Integer>head1=mid.next;
		mid.next=null;
		head=sort(head);
		head1=sort(head1);
		return merge(head,head1);
	}
	public static Node<Integer> getMidNode(Node<Integer> head) 
	{
		Node<Integer>fast=head.next,slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public static Node<Integer> merge(Node<Integer> head1,Node<Integer>head2) 
	{
		Node<Integer> head=null,tail=null,temp=head1;
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