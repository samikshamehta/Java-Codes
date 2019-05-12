import java.util.Scanner;


public class TreeNodesGreaterThanX
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		//printGenericTree(root);
		int x=s.nextInt();
		int max=numNodeGreater(root,x);
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
	public static int numNodeGreater(TreeNode<Integer> root,int x)
    {
		int count=0;
		int result=NumNodeGreater(root,x,count);
		return result;
	}
	public static int NumNodeGreater(TreeNode<Integer> root,int x,int count)
    {
		TreeNode<Integer> temp=root;
		 for(int i=0;i<root.children.size();i++)
		 {			 
		     count= NumNodeGreater(root.children.get(i),x,count);
		 }
		 if(temp.data>x)
		 {
			 count++;
		 }
		return count;
    }
}
