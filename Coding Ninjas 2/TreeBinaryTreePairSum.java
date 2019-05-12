import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class TreeBinaryTreePairSum {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printLevelWise(root);
		int sum=s.nextInt();
		nodesSumToS(root,sum);
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
	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) 
	{
		ArrayList<Integer>a= NodesSumToS(root);
		for(int i=0;i<a.size()-1;i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)+a.get(j)==sum)
				{
					System.out.println(a.get(i)+ " "+a.get(j));
				}
			}
		}
	}
	public static ArrayList<Integer> NodesSumToS(BinaryTreeNode<Integer> root) 
	{
		if(root==null)
		{
			return null;
		}
		a.add(root.data);
		NodesSumToS(root.left);
		NodesSumToS(root.right);
		Collections.sort(a);
		return a;
	}
}
	
