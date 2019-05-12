import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class HashMapVerticalOrder {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) 
	{
		BinaryTreeNode<Integer> root = takeInput_R();
		printLevelWise(root);
		printBinaryTreeVerticalOrder(root);
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
	static HashMap<Integer,ArrayList<Integer>>hash=new HashMap<>();
	static ArrayList<Integer> arr=new ArrayList<Integer>();
	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root)
	{
		int count=0;
		PrintBinaryTreeVerticalOrder(root,count);
	}
	public static void PrintBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root,int count)
	{
		if(root==null)
		{
			return;
		}
		arr=hash.get(count);
		if(arr==null)
		{
			arr.add(root.data);
			hash.put(count,arr);
		}
		else
		{
			int index=arr.size();
			arr.add(index, root.data);
			hash.put(count,arr);
		}
		PrintBinaryTreeVerticalOrder(root.left,count-1);
		PrintBinaryTreeVerticalOrder(root.right,count+1);
		if(count!=-(count))
		{
			
		}
	}
}