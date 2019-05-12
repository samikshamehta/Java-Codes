import java.util.LinkedList;
import java.util.Scanner;


public class TreeBSTFindDiameter {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printLevelWise(root);
		int result=diameterOfBinaryTree(root);
		System.out.print(result);
	
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
	public static void printLevelWise(BinaryTreeNode<Integer> root)
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
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftdiameter=diameterOfBinaryTree(root.left);
		int rightdiameter=diameterOfBinaryTree(root.right);
		int x=height(root.left)+height(root.right)+1;
		return(Math.max((Math.max(leftdiameter, rightdiameter)),x));
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