import java.util.Scanner;
public class LinkedListDeleteFriends
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=s.nextInt();
			int k=s.nextInt();
			LinkedListNode<Integer> head=null;
			for(int i=0;i<n;i++)
			{
				int data=s.nextInt();
				head=create(head,data);
			}
			LinkedListNode<Integer> headmain=head;
			while(k!=0)
			{
				boolean deletefriend=false;
				LinkedListNode<Integer> temp=null;
				head=headmain;
				while(deletefriend!=true)
				{
					if(head.data<head.next.data)
					{
						if(headmain==head)
						{
							head=head.next;
							headmain=headmain.next;
							deletefriend=true;
						}
						else
						{
							temp.next=head.next;
							head=head.next;
							deletefriend=true;
						}
					}
					else
					{
						temp=head;
						head=head.next;
					}
				}
				if(deletefriend==false)
				{
					headmain=head.next;
				}
				k--;
			}
			while(headmain!=null)
			{
				System.out.print(headmain.data+" ");
				headmain=headmain.next;
			}
			System.out.println();
		}
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
}
