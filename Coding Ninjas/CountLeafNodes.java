import java.util.Scanner;


public class CountLeafNodes {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		//printGenericTree(root);
		int max=countLeafNodes(root);
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
	public static int countLeafNodes(TreeNode<Integer> root)
	{
		int count=0;
		int result=CountLeafNodes(root,count);
		return result;
	}
	public static int CountLeafNodes(TreeNode<Integer> root,int count)
	{
		TreeNode<Integer> temp=root;
		 for(int i=0;i<root.children.size();i++)
		 {			 
		     count= CountLeafNodes(root.children.get(i),count);
		 }
		 if(temp.children.size()==0)
		 {
			 count++;
		 }
		return count;
   }
}
