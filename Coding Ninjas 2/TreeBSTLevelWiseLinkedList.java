import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;



public class TreeBSTLevelWiseLinkedList {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		ArrayList<Node<BinaryTreeNode<Integer>>>result=LLForEachLevel(root);
		for(int i=0;i<result.size();i++)
		{
			System.out.print(result.get(i).data.data+" ");
			Node<BinaryTreeNode<Integer>>var=result.get(i).next;
			while(var!=null)
			{
				System.out.print(result.get(i).data.data+" ");
				var=var.next;
			}
			System.out.println();
		}
	}

	// Take Input
	public static BinaryTreeNode<Integer> takeInput_R()
	{
		//System.out.println("Enter root data");
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
	
	// In, Pre, Post Order
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) 
	{
		LinkedList<BinaryTreeNode<Integer>>queue=new LinkedList<BinaryTreeNode<Integer>>();
		ArrayList<Node<BinaryTreeNode<Integer>>> array=new ArrayList<Node<BinaryTreeNode<Integer>>>();
		int levelNodes=0;
		if(root==null)
		{
			return null;
		}
		queue.add(root);
		while(!queue.isEmpty())
		{
			levelNodes=queue.size();
			Node<BinaryTreeNode<Integer>>head=null;
			Node<BinaryTreeNode<Integer>>curr=null;
			while(levelNodes>0)
			{
				BinaryTreeNode<Integer>N=queue.remove();
				Node<BinaryTreeNode<Integer>>In =new Node<>(N);
				if(head==null)
				{
					head=In;
					curr=In;
				}
				else
				{
					curr.next=In;
					curr=curr.next;
				}
				if(N.left!=null)
				{
					queue.add(N.left);
				}
				if(N.right!=null)
				{
					queue.add(N.right);
				}
				levelNodes--;
			}
			array.add(head);
		}
		return array;
	}
}