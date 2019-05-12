import java.util.LinkedList;
import java.util.Scanner;


public class TreePathSumRootToLeaf {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printLevelWise(root);
		int k=s.nextInt();
		rootToLeafPathsSumToK(root,k);
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
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) 
    {
      	int[] path=new int[1000];
    	RootToLeafPathsSumToK(root,path,0,k);
    }
	public static void RootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int path[],int index,int k) 
	{
		if(root==null)
		{
			return;
		}
		path[index]=root.data;
		index++;
		if(root.left==null && root.right==null)
		{
			printpath(path,index,k);
		}
		else
		{
			RootToLeafPathsSumToK(root.left,path,index,k);
			RootToLeafPathsSumToK(root.right,path,index,k);
		}
	}
	public static void printpath(int path[],int index,int k)
	{
		int sum=0;
		for(int i=0;i<index;i++)
		{
			sum=sum+path[i];
		}
		if(sum==k)
		{
			for(int i=0;i<index;i++)
			{
				System.out.print(path[i]+ " ");
			}
			System.out.println();
		}
	}
}
