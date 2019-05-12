import java.util.Scanner;

/*class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}*/
public class PrintIthNodeLL {

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
		int i=s.nextInt();
		printIth(head, i);
		
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
	public static void printIth(LinkedListNode<Integer> head, int i)
	{
		int count=0;
		PrintIth(head,i,count);
	}
	public static void PrintIth(LinkedListNode<Integer> head, int i,int count)
	{
		if(head!=null)
		{
			if(count==i)
			{
				System.out.print(head.data);
				return;
			}
			PrintIth(head.next,i,count+1);
		}
		return;
	}
}
