import java.util.Scanner;


public class TreeBSTFindNode {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printTree(root);
		int x=s.nextInt();
		boolean nodeispresent=isNodePresent(root,x);
		System.out.println();
		System.out.println(nodeispresent);
	
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
		if (root == null)
		{
			return;
		}
		
		printTree(root.left);
		System.out.print(root.data + " ");
		printTree(root.right);
	}
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==x)
		 {
			 return true;
		 }
		 boolean ans= isNodePresent(root.left,x);
		 if(ans==true)
		 {
			 return true;
		 }
		 ans=isNodePresent(root.right,x);
		 if(ans==true)
		 {
			 return true;
		 }
		return false;
	
	}
}