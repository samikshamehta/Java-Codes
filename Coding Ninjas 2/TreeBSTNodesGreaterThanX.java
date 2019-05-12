import java.util.Scanner;


public class TreeBSTNodesGreaterThanX {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printTree(root);
		int x=s.nextInt();
		int count=numNodesGreaterX(root,x);
		System.out.println();
		System.out.println(count);
	
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
	public static int numNodesGreaterX(BinaryTreeNode<Integer> root,int x)
	{
		int count=0;
		int result=NumNodesGreaterX(root,x,count);
		return result;
	}
	public static int NumNodesGreaterX(BinaryTreeNode<Integer> root,int x,int count)
	{
		if(root==null)
		{
			return 0;
		}
		 count= NumNodesGreaterX(root.left,x,count)+NumNodesGreaterX(root.right,x,count);
		 if(root.data>x)
		 {
			 count++;
		 }
		return count;
	
	}
}