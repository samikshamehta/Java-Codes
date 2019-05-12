import java.util.LinkedList;
import java.util.Scanner;


public class TreeBSTToLL 
{
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		BinaryTreeNode<Integer> root = takeInput_R();
		LinkedListNode<Integer>head= BSTToSortedLL(root);
		printRec(head);
	}
	public static BinaryTreeNode<Integer> takeInput_R()
	{
		int rootData = s.nextInt();
		if (rootData != -1)
		{
			BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
			root.left = takeInput_R();
			root.right = takeInput_R();
			return root;
		}
		return null;
	}
	static LinkedListNode<Integer>head=null,temp;
	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root)
	{		
		if(root==null)
		{
			return null;
		}
		BSTToSortedLL(root.left);
		if(head==null)
		{
			head=new LinkedListNode<>(root.data);
			temp=head;
		}
		else
		{
			temp.next=new LinkedListNode<>(root.data);
			temp=temp.next;
		}
		BSTToSortedLL(root.right);
		return head;
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
}