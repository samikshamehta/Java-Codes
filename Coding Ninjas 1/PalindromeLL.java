import java.util.Scanner;


public class PalindromeLL {

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
		boolean result=isPalindrome_2(head);
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
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) 
	{
		LinkedListNode<Integer> tail=head;
		boolean result=IsPalindrome_2(head,tail);
		return result;
	}
	public static boolean IsPalindrome_2(LinkedListNode<Integer> head,LinkedListNode<Integer> tail)
	{
		LinkedListNode<Integer> prev=null;
		int count=0;
		while(tail!=null)
		{
			tail=tail.next;
			count++;
		}
		count=count/2;
		tail=head;
		while(count!=1)
		{
			tail=tail.next;
			count--;
		}
		LinkedListNode<Integer> temp=tail.next;
		tail.next=null;
		tail=temp;
		while(tail!=null)
		{
			temp=tail.next;
			tail.next=prev;
			prev=tail;
			tail=temp;
		}
		tail=prev;
		while(head!=null)
		{
			if(head.data.equals(tail.data))
			{
				head=head.next;
				tail=tail.next;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}