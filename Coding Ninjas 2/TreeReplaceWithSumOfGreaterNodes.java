import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class TreeReplaceWithSumOfGreaterNodes {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printLevelWise(root);
		replaceWithLargerNodesSum(root);
		printLevelWise(root);
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
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) 
	{
		ArrayList<Integer> arr=array(root);
		int sum=0;
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<arr.size();j++)
			{
				if(arr.get(i)<=arr.get(j))
				{
					sum=sum+arr.get(j);
				}
			}
			print(root,sum,arr.get(i));
			sum=0;
		}
	}
	static ArrayList<Integer>arr=new ArrayList<>();
	public static ArrayList<Integer> array(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		arr.add(root.data);
		if(root.left==null && root.right==null)
		{
			return null;
		}
		else
		{
			array(root.left);
			array(root.right);
		}
		return arr;
	}
	public static void print(BinaryTreeNode<Integer> root,int sum,int val) 
	{
		if(root==null)
		{
			return;
		}
		if(root.data==val)
		{
			root.data=sum;
			return;
		}
		else
		{
			print(root.left,sum,val);
			print(root.right,sum,val);
		}
	}

}