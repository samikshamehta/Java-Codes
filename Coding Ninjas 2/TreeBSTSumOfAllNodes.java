import java.util.Scanner;


public class TreeBSTSumOfAllNodes {

	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printTree(root);
		int sum=sum(root);
		System.out.println();
		System.out.println(sum);
	
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
	public static int sum(BinaryTreeNode<Integer> root)
	 {
		if(root==null)
		{
			return 0;
		}
		return(root.data+sum(root.left)+sum(root.right));
    }
}