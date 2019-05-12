import java.util.Scanner;


public class TreeSumOfAllNodes {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		printGenericTree(root);
		int max=sumOfAllNode(root);
		System.out.println(max);
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
	public static int sumOfAllNode(TreeNode<Integer> root)
	{
	     int ans=root.data;
	    for(int i=0;i<root.children.size();i++)
	    {
	       ans += sumOfAllNode(root.children.get(i));
	    	
	    }
	    return ans;
	}
}
