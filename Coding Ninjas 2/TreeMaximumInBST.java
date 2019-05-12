import java.util.Scanner;
//8 3 1 -1 -1 6 4 -1 -1 7 -1 -1 10 -1 14 13 -1 -1 -1
public class TreeMaximumInBST {
	
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printTree(root);
		BinaryTreeNode<Integer> max=maxDataNode(root);
		System.out.println();
		System.out.println(max.data);
	
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
	public static BinaryTreeNode<Integer> maxDataNode(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		if(root.right==null)
		{
			return root;
		}
		return(maxDataNode(root.right));
	}
}