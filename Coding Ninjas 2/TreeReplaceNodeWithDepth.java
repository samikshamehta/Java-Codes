import java.util.Scanner;


public class TreeReplaceNodeWithDepth {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		printGenericTree(root);
		replaceWithDepthValue(root);
		printGenericTree(root);
		
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
	public static void replaceWithDepthValue(TreeNode<Integer> root)
	{
		int k=0;
		ReplaceWithDepthValue(root,k);
	}
	public static void ReplaceWithDepthValue(TreeNode<Integer> root,int k)
	{
		if(k==0)
		{
			root.data=k;
			k++;
		}
		for(int i=0;i<root.children.size();i++)
			{
				root.children.get(i).data=k;
			}
			k++;
			for(int i=0;i<root.children.size();i++)
			{
				ReplaceWithDepthValue(root.children.get(i),k);
			}
		}
}