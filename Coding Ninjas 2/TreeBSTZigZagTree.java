import java.util.Scanner;
import java.util.Stack;

//5 6 2 9 -1 -1 -1 -1 10 3 -1 -1 -1
public class TreeBSTZigZagTree {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printZigZag(root);
	
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
	public static void printZigZag(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack<BinaryTreeNode<Integer>>stacks=new Stack<>();
		stacks.push(root);
		boolean flag=false;
		while(!stacks.isEmpty())
		{
			Stack<BinaryTreeNode<Integer>>tempstack=new Stack<>();
			while(!stacks.isEmpty())
			{
				BinaryTreeNode<Integer>temp=stacks.pop();
				System.out.print(temp.data+" ");
				if(!flag)
				{
					if(temp.left!=null)
					{
						tempstack.push(temp.left);
					}
					if(temp.right!=null)
					{
						tempstack.push(temp.right);
					}
				}
				else
				{
					if(temp.right!=null)
					{
						tempstack.push(temp.right);
					}
					if(temp.left!=null)
					{
						tempstack.push(temp.left);
					}
				}
			}
			flag=!flag;
			stacks=tempstack;
			System.out.println();
		}
	}
}