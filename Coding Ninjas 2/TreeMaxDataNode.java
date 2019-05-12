import java.util.Scanner;
//10 3 20 2 40 0 50 0 30 0 40 0
public class TreeMaxDataNode 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		printGenericTree(root);
		TreeNode<Integer> max=maxDataNode(root);
		System.out.println(max.data);
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
	public static TreeNode<Integer> maxDataNode(TreeNode<Integer> root)
    { 
		TreeNode<Integer> max = root;
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer> ans = maxDataNode(root.children.get(i));
			if(max.data < ans.data)
			{
				max = ans;
			}
		}
		return max;
	}
}