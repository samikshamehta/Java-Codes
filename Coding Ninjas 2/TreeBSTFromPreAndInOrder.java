import java.util.LinkedList;
import java.util.Scanner;


public class TreeBSTFromPreAndInOrder {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=s.nextInt();
		int preorder[]=new int[n];
		int inorder[]=new int[n];
		for(int i=0;i<n;i++)
		{
			preorder[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			inorder[i]=s.nextInt();
		}
		BinaryTreeNode<Integer>tree= getTreeFromPreorderAndInorder(preorder,inorder);
		printTree(tree);
	}
	public static void printTree(BinaryTreeNode<Integer> root)
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
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,int[] in)
	{
		int start=0, end=pre.length-1;
		BinaryTreeNode<Integer>tree=GetTreeFromPreorderAndInorder(pre,in,start,end);
		return tree;
	}
	static int preindex=0;
	public static BinaryTreeNode<Integer> GetTreeFromPreorderAndInorder(int[] pre,int[] in,int start,int end)
	{
		if(start>end)
		{
			return null;
		}
		if(start==end)
		{
			BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(pre[preindex]);
			preindex++;
			return root;
		}
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(pre[preindex]);
		int index=search(in,pre[preindex],start,end);
		preindex++;
		root.left=GetTreeFromPreorderAndInorder(pre,in,start,index-1);
		root.right=GetTreeFromPreorderAndInorder(pre,in,index+1,end);
		return root;
	}
	public static int search(int[] in,int val,int start,int end)
	{
		if(in[start]==val)
		{
			return start;
		}
		int index=search(in,val,start+1,end);
		return index;
	}
}

