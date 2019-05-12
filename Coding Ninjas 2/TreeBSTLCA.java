import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class TreeBSTLCA {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printTree(root);
		int a=s.nextInt();
		int b=s.nextInt();
		int max=lcaInBST(root,a,b);
		System.out.println(max);
	
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
	public static void printTree(BinaryTreeNode<Integer> root) 
	{
		LinkedList<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		int levelNodes=0;
		if(root==null)
		{
			return;
		}
		queue.add(root);
		while(!queue.isEmpty())
		{
			levelNodes=queue.size();
			while(levelNodes>0)
			{
				BinaryTreeNode<Integer>Node=queue.remove();
				System.out.print(Node.data+" ");
				if(Node.left!=null)
				{
					queue.add(Node.left);
				}
				if(Node.right!=null)
				{
					queue.add(Node.right);
				}
				levelNodes--;
			}
			System.out.println();
		}
	}
	static ArrayList<Integer> array=new ArrayList<Integer>();
	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b)
	{
		array=arrays(root);
		int ab=0,ba=0;
		BinaryTreeNode <Integer> tree=null;
		for(int i=0;i<array.size();i++)
		{
			if(array.get(i)==a)
			{
				ab=1;
			}
			if(array.get(i)==b)
			{
				ba=1;
			}
		}
		if(ab==1 && ba==0)
		{
			return a;
		}
		if(ba==1 && ab==0)
		{
			return b;
		}
		if(ab==0 && ba==0)
		{
			return -1;
		}
		if(ab==1 && ba==1)
		{
			tree=LcaInBST(root,a,b);
			return tree.data;
		}
		return tree.data;
	}
	public static ArrayList<Integer> arrays(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		array.add(root.data);
		if(root.left==null && root.right==null)
		{
			return null;
		}
		else
		{
			arrays(root.left);
			arrays(root.right);
		}
		return array;
	}
	public static BinaryTreeNode <Integer> LcaInBST(BinaryTreeNode <Integer> root , int a, int b)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data>a && root.data>b)
		{
			return LcaInBST(root.left,a,b);
		}
		if(root.data<a && root.data<b)
		{
			return LcaInBST(root.right,a,b);
		}
		return root;
	}
}