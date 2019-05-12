import java.util.Scanner;

class Nodes
{
	int data;
	Nodes next;
	
	Nodes(int data)
	{
		this.data=data;
	}
}
public class RecursionLinkedlist
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		Nodes head=new Nodes(10);
		head.next=new Nodes(20);
		head.next.next=new Nodes(30);
		head.next.next.next=new Nodes(50);
		head.next.next.next.next=new Nodes(60);
		printRec(head);
		head=ReverseRec(head,null);
		System.out.println();
		printRec(head);
		int data=s.nextInt();
		int pos=s.nextInt();
		insert(head,data,pos);
		printRec(head);

	}
	static void insert(Nodes head,int data, int pos)
	{
		if(pos==1)
		{
			Nodes newNodes=new Nodes(data);
			newNodes.next=head.next;
			head.next=newNodes;
			return;
		}
		insert(head.next,data,pos-1);
	}
	static Nodes ReverseRec(Nodes head, Nodes prev)
	{
		if(head==null)
		{
			return prev;
		}
		Nodes temp=head.next;
		head.next=prev;
		return ReverseRec(temp,head);
	}
	static void printRec(Nodes head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+"-->");
		printRec(head.next);
	}

}
