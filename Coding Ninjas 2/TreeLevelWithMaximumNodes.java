import java.util.Scanner;

//10 3 20 2 40 4 11 0 12 0 13 0 14 6 15 0 16 0 17 0 18 0 19 0 20 0 50 3 1 0 2 0 3 0 30 0 40 0

public class TreeLevelWithMaximumNodes {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		printGenericTree(root);
		int maxLevelChild=maxLevel(root);
		System.out.println(maxLevelChild);
		
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
	public static int maxLevel(TreeNode<Integer> root)
	{
		int k=0,sum=0,level=0;
		int count=maxLevel(root,k,sum,level);
		return count;
	}
	public static int maxLevel(TreeNode<Integer> root,int k,int sum,int level)	
	{
		if(k==0)
		{
			sum=1;
			level=0;
			k++;
		}
		for(int i=0;i<root.children.size();i++)
		{
			int max=root.children.size();
			if(sum<max)
			{
				sum=max;
				level=k;
			}
		}
		k++;
		for(int i=0;i<root.children.size();i++)
		{
			level=maxLevel(root.children.get(i),k,sum,level);
		}
		return level;
	}
}