import java.util.Scanner;


public class TreeBSTCountLeafNodes 
{
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printTree(root);
		int count=noOfLeafNodes(root);
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
	public static int noOfLeafNodes(BinaryTreeNode<Integer> root)
	{
		int count=0;
		int result=NoOfLeafNodes(root,count);
		return result;
	}
	public static int NoOfLeafNodes(BinaryTreeNode<Integer> root,int count)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null&&root.right==null)
		{
			count++;
			return count;
		}
		return(NoOfLeafNodes(root.left,count)+NoOfLeafNodes(root.right,count));
	}
}