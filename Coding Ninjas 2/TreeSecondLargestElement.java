import java.util.LinkedList;
import java.util.Scanner;


public class TreeSecondLargestElement {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		printGenericTree(root);
		TreeNode<Integer> max=findSecondLargest(root);
		System.out.println("maxsecond"+" "+max.data);
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
	/*public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root)
	{
		TreeNode<Integer>max=maxDataNode(root);
		TreeNode<Integer>maxsecond=root;
		LinkedList<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode<Integer> currentNode = queue.removeFirst();
			if(maxsecond.data<currentNode.data && currentNode.data<max.data)
			{
				maxsecond=currentNode;
			}
			for(int i=0;i<currentNode.children.size();i++)
			{
				queue.add(currentNode.children.get(i));
			}
		}
		return maxsecond;
	}
	public static TreeNode<Integer> maxDataNode(TreeNode<Integer> root)
    { 
		TreeNode<Integer> max = root;
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer> ans = maxDataNode(root.children.get(i));
			if(max.data < ans.data)
			{
				max=ans;
			}
		}
		return max;
	}*/
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root)
	{
      TreeNode<Integer> mx1=maxDataNode(root);
      if(root.data==mx1.data)
      {
        mx1.data=Integer.MIN_VALUE;
      }
      for(int i=0;i<root.children.size();i++) 
      {
		findSecondLargest(root.children.get(i));
	  }
      TreeNode<Integer> mx2=maxDataNode(root);
      return mx2;
    }
	static TreeNode<Integer> max=new TreeNode<>(-1);
	public static TreeNode<Integer> maxDataNode(TreeNode<Integer> root)
	{ 
	   if(root==null) 
       {
			return null;
       }
		if(root.data > max.data)
		{
          max=root;
        }
		for(int i=0;i<root.children.size();i++) 
		{
			maxDataNode(root.children.get(i));
		}
      return max;
	}
}