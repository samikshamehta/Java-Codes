import java.util.Scanner;

/*class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}*/

public class LengthOfLL 
{

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
		int result=length(head);
		System.out.println(result);
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
	public static int length(LinkedListNode<Integer> head)
	{
		int count=0;
		try
		{		
			while(head.data!=-1)
			{
				head=head.next;
				count++;
			}
		}
		catch(Exception e)
		{
			return count;
		}
		return count;
	}
}
