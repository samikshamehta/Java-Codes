import java.util.LinkedList;
import java.util.Scanner;

//5 6 2 -1 -1 3 -1 9 -1 -1 10 -1 -1

public class TreePrintNodesAtKDistanceFromNode {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		BinaryTreeNode<Integer> root = takeInput_R();
		printLevelWise(root);
		int node=s.nextInt();
		int k=s.nextInt();
		nodesAtDistanceK(root,node,k);
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
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k)
	{
		int result=NodesAtDistanceK(root,node,k);
	}
	public static int NodesAtDistanceK(BinaryTreeNode<Integer> root, int node,int k)
	{
		if (root==null)
		{
            return -1;
		}
        if (root.data==node) 
        {
        	NodeAtDistanceK(root,k);
            return 0;
        }
        int dl = NodesAtDistanceK(root.left,node,k);
        if (dl!=-1)
        {
        	if (dl+1==k) 
            {
                System.out.print(root.data);
                System.out.println();
            }
        	else
        	NodeAtDistanceK(root.right,k-dl-2);
        	return dl+1;
        }
        int dr = NodesAtDistanceK(root.right,node,k);
        if (dr!=-1) 
        {
            if (dr+1==k) 
            {
                System.out.print(root.data);
                System.out.println();
            } 
            else 
            NodeAtDistanceK(root.left, k-dr-2);
            return dr+1;
        }
        return -1;
    }
	public static void NodeAtDistanceK(BinaryTreeNode<Integer> root, int k)
	{
		if (root==null||k<0)
		{
	            return;
		}
		if(k==0)
		{
			System.out.print(root.data);
	        System.out.println();
	        return;
		}
		NodeAtDistanceK(root.left,k-1);
		NodeAtDistanceK(root.right,k-1);
	}
}
	