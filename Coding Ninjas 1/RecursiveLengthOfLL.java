import java.util.Scanner;


public class RecursiveLengthOfLL {

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
	public static int length(LinkedListNode<Integer> head){
		int count=0;
		int result=Length(head,count);
		return result;
	}
	public static int Length(LinkedListNode<Integer> head,int count){
		if(head==null)
		{
			return count;
		}
		return(Length(head.next,count+1));

	}

}
