import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;


public class TreeBSTNodesInGivenRange {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printLevelWise(root);
		int k1=s.nextInt();
		int k2=s.nextInt();
		printNodeFromK1ToK2(root,k1,k2);
		//printLevelWise(root);
	
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
	static ArrayList<Integer> a=new ArrayList<>();
	public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2)
	{
		ArrayList<Integer>a=PrintNodeFromK1ToK2(root,k1,k2);
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+ " ");
		}
	}
	public static ArrayList<Integer> PrintNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data>=k1 && root.data<=k2)
		{
			a.add(root.data);
		
		}
		PrintNodeFromK1ToK2(root.left,k1,k2);
		PrintNodeFromK1ToK2(root.right,k1,k2);
		Collections.sort(a);
		return a;
	}
}