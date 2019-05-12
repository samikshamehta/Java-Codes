import java.util.LinkedList;
import java.util.Scanner;


public class TreeBSTFromPostAndInOrder {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=s.nextInt();
		int postorder[]=new int[n];
		int inorder[]=new int[n];
		for(int i=0;i<n;i++)
		{
			postorder[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			inorder[i]=s.nextInt();
		}
		BinaryTreeNode<Integer>tree= getTreeFrompostorderAndInorder(postorder,inorder);
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
	public static BinaryTreeNode<Integer> getTreeFrompostorderAndInorder(int[] post,int[] in)
	{
		int start=0, end=post.length-1,pindex=post.length-1;
		BinaryTreeNode<Integer>tree=GetTreeFrompostorderAndInorder(post,in,start,end,pindex);
		return tree;
	}
	public static BinaryTreeNode<Integer> GetTreeFrompostorderAndInorder(int[] post,int[] in,int start,int end,int pindex)
	{
		if(start>end)
		{
			return null;
		}
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(post[pindex]);
		if(start==end)
		{
			return root;
		}
		int index=search(in,post[pindex],start,end);
		root.right=GetTreeFrompostorderAndInorder(post,in,index+1,end,pindex-1);
		root.left=GetTreeFrompostorderAndInorder(post,in,start,index-1,pindex-(end-index)-1);
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

