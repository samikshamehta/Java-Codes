import java.util.Scanner;


public class AppendLastNToFirstLL {

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
		int i=s.nextInt();
		head=append(head,i);
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
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) 
	{
		if(n==0)
		{
			return null;
		}
		LinkedListNode<Integer>tail=root;
		int count=0;
		while(tail!=null)
		{
			tail=tail.next;
			count++;
		}
		tail=root;
		count=count-n;
		while(count!=1)
		{
			tail=tail.next;
			count--;
		}
		if(count==1)
		{
			LinkedListNode<Integer>temp=tail.next;
			tail.next=null;
			tail=temp;
			while(tail.next!=null)
			{
				tail=tail.next;		
			}
			if(tail.next==null)
			{
				tail.next=root;
				root=temp;
			}
		}
		return root;
	}

}
