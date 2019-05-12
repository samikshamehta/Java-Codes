import java.util.LinkedList;
import java.util.Scanner;

public class TreeLargestBST {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printLevelWise(root);
		int result=largestBSTSubtree(root);
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
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root)
	{
		LinkedList<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		int levelNodes=0;
		int result=0,res = 0;
		if(root==null)
		{
			return 0;
		}
		queue.add(root);
		while(!queue.isEmpty())
		{
			levelNodes=queue.size();
			while(levelNodes>0)
			{
				BinaryTreeNode<Integer>Node=queue.remove();
				boolean ans=isBST(Node);
				if(ans)
				{
					 res=height(Node);
				}
				if(res>result)
				{
					result=res;
				}
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
		}
		return result;
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
		if(root==null)
		 {
			return new BinaryTreeNode<Integer>(Integer.MAX_VALUE);
		}
		while(root.left!=null){
			root= root.left;
		}
		return root;
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