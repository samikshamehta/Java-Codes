import java.util.Scanner;


public class TreeBSTCheckBalanced {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printTree(root);
		boolean check=isBST(root);
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
	public static boolean isBST(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		boolean ans = isBST(root.left);
		if(ans)
		{
		 ans = isBST(root.right);
		}
		if(!ans)
		{
			return false;
		}
		int leftSideMax = maxDataNode(root.left).data;
		int rightSideMin = minDataNode(root.right).data;
		if(!(root.data.compareTo(leftSideMax)>0&&root.data.compareTo(rightSideMin)<0))
		{
			return false;
		}
		return true;
	}
	public static BinaryTreeNode<Integer> maxDataNode(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return new BinaryTreeNode<Integer>(Integer.MIN_VALUE);
		}
		while(root.right!=null)
		{
			root= root.right;
		}
		return root;
	}
	public static BinaryTreeNode<Integer> minDataNode(BinaryTreeNode<Integer> root)
	{
		if(root==null){
			return new BinaryTreeNode<Integer>(Integer.MAX_VALUE);
		}
		while(root.left!=null){
			root= root.left;
		}
		return root;
	}
}
