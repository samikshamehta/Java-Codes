import java.util.Scanner;


public class TreeNodesAtDepthK {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		int k=s.nextInt();
		//printGenericTree(root);
		printNodesAtDepthK(root,k);
		
	}
	static TreeNode<Integer> createGenericTree()
	{
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data);
		int noOfChildren = s.nextInt();
		for (int i = 0; i < noOfChildren; i++)
		{
			TreeNode<Integer> child = createGenericTree();
			root.children.add(child);
		}
	return root;
	}
	static void printGenericTree(TreeNode<Integer> root)
	{
		String toBePrinted = root.data + ": ";
		for (int i = 0; i < root.children.size(); i++)
		{
			toBePrinted = toBePrinted + root.children.get(i).data + ", ";
		}
		System.out.println(toBePrinted);
		for (int i = 0; i < root.children.size(); i++)
		{
			printGenericTree(root.children.get(i));
		}
	}
	public static void printNodesAtDepthK(TreeNode<Integer> root, int k)
	{
		int count=0;
		PrintNodesAtDepthK(root,k,count);
	}
	public static void PrintNodesAtDepthK(TreeNode<Integer> root, int k,int count)
	{
		if(k==0)
		{
			System.out.println(root.data);
		}
		else
		{
			if(count==k-1)
			{
				for(int i=0;i<root.children.size();i++)
				{
					System.out.print(root.children.get(i).data+" ");
				}
				count=0;
			}
			for(int i=0;i<root.children.size();i++)
			{
				PrintNodesAtDepthK(root.children.get(i),k,count+1);
			}
		}
	}

}