import java.util.Scanner;


public class KreverseLL {

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
		int k=s.nextInt();
		head=kReverse(head,k);
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
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) 
	{
		LinkedListNode<Integer>resulthead = null,tail=head,head1 = null,extra = null,prev=null;
		int var=0;
		while(head!=null)
		{
			int count=k;
			while(count!=1 && head!=null)
			{
				head=head.next;
				count--;
			}
			if(head==null)
			{
				resulthead=Reverse_R(resulthead,null);
				extra.next=resulthead;
				return tail;
			}
			head1=head.next;
			head.next=null;
			if(var==0)
			{
				extra=tail;
				tail=Reverse_R(tail,null);
				var++;
			}
			else
			{
				prev=resulthead;
				resulthead=Reverse_R(resulthead,null);
				extra.next=resulthead;
				extra=prev;
				
			}
			head=head1;
			resulthead=head1;
			
			
		}
		return tail;		
	}
	public static LinkedListNode<Integer> Reverse_R(LinkedListNode<Integer> head, LinkedListNode<Integer> prev)
	{
		if(head==null)
		{
			return prev;
		}
		LinkedListNode<Integer> temp=head.next;
		head.next=prev;
		return Reverse_R(temp,head);
	}
}