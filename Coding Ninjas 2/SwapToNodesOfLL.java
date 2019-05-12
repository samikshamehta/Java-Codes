import java.util.Scanner;


public class SwapToNodesOfLL {

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
		int j=s.nextInt();
		head=swap_nodes(head,i,j);
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
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j)
	{
		LinkedListNode<Integer> tail=head;
		LinkedListNode<Integer> tempi=null,tempj=null;
		int count=0;
		try
		{
			if(i<j)
			{
				while(head!=null)
				{
					if(count==j-1)
					{
						tempj=head.next;
						head.next=tempj.next;
						tempj.next=null;
						head=head.next;
						count++;
					}
					else
					{
						head=head.next;
					}
					count++;
				}
				count=0;
				head=tail;
				if(i==0)
				{
					tempi=head;
					head=head.next;
					tail=head;
					count++;
				}
				else
				{
					while(head!=null)
					{
						if(count==i-1)
						{
							tempi=head.next;
							head.next=tempi.next;
							tempi.next=null;
							head=head.next;
							count++;
						}
						else
						{
							head=head.next;
						}
						count++;
					}
				}
				tail= insertR(tail, tempj,i);
				tail= insertR(tail, tempi,j);
			}
			else
			{
				while(head!=null)
				{
					if(count==i-1)
					{
						tempi=head.next;
						head.next=tempi.next;
						tempi.next=null;
						head=head.next;
						count++;
					}
					else
					{
						head=head.next;
					}
					count++;
				}
				count=0;
				head=tail;
				if(j==0)
				{
					tempj=head;
					head=head.next;
					tail=head;
					count++;
				}
				else
				{
					while(head!=null)
					{
						if(count==j-1)
						{
							tempj=head.next;
							head.next=tempj.next;
							tempj.next=null;
							head=head.next;
							count++;
						}
						else
						{
							head=head.next;
						}
						count++;
					}
				}
				tail= insertR(tail, tempi,j);
				tail= insertR(tail, tempj,i);
			}
		}
		catch(Exception e)
		{
			return tail;

		}
		return tail;
	}
	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head,LinkedListNode<Integer> temp,int pos)
	{
		if(pos==0)
			{
				temp.next=head;
				return temp;
			}
			head.next=insertR(head.next,temp, pos-1);
		return head;
	}
}

		/*while(count<=j)
		{
			if(count<i)
			{
				if(count==i-1)
				{
					tempi=tail;
					count++;
				}
				else
				{
					tail=tail.next;
					count++;
				}
			}
			else
			{
				if(count==j-1)
				{
					tempj=tail.next;
					count++;
				}
				else
				{
					tail=tail.next;
					count++;
				}
			}	
		}
		LinkedListNode<Integer> temp=tempi.next;
		tempi.next=tempj;
		tempi=temp;
		if(j-i==1)
			{
				temp=tempj.next;
				tempj.next=tempi;
				tempi.next=temp;
			}
			else
			{
				temp=tempj.next;
				tempj.next=tempi.next;
				tempi.next=temp;
			}*/
		