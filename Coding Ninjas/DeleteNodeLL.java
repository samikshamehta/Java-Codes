import java.util.Scanner;


public class DeleteNodeLL {
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
			int i=s.nextInt();
			head=deleteIthNode(head,i);
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
	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i)
	{
		int count=0;
		LinkedListNode<Integer> temp=head;
		try
		{
			if(i==0)
			{
				head=head.next;
				return head;
			}
			while(temp!=null)
			{
				if(count<i-1)
				{
					temp=temp.next;
					count++;
				}
				else
				if(count++==i)
				{
					temp.next=temp.next.next;
					break;
				}
			}
		}
		catch(Exception e)
		{
			return head;
		}
		return head;
	}
}
