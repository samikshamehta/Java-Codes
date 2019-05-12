import java.util.Scanner;


public class InsertNodeLL
{
	public static void main(String[] args)
	{
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
		int data=s.nextInt();
		int pos=s.nextInt();
		head=insert(head,data,pos);
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
	public static Node<Integer> insert(Node<Integer> head, int data, int pos)
	{
		Node<Integer> temp=head;
		if(pos==0)
		{
			Node<Integer> newNode=new Node<Integer> (data);
			newNode.next=head;
			head=newNode;
		}
		while(temp!=null)
		{
			if(pos==1)
			{
				Node<Integer> newNode=new Node<Integer> (data);
				newNode.next=temp.next;
				temp.next=newNode;
			}
			else
			{
				temp=temp.next;
			}
			pos=pos-1;
		}
		return head;	
	}
}
