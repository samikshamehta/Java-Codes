import java.util.Scanner;


public class TreeIsBalanced {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printTree(root);
		boolean check=checkBalanced(root);
		System.out.println();
		System.out.println(check);
	
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
	public static boolean checkBalanced(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		if(Math.abs(leftheight-rightheight)<=1 && checkBalanced(root.left) && checkBalanced(root.right))
		{
			return true;
		}
		return false;
	}
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		return(Math.max(height(root.left), height(root.right)))+1;
	}
}
