import java.util.Scanner;


public class TreeNodeHavingSumOfChildrenAndNodeIsMax {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		printGenericTree(root);
		TreeNode<Integer> max=maxSumNode(root);
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
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root)
    {
		TreeNode<Integer>max=root;
      if(root==null)
      {
        return null;
      }
      for(int i=0;i<root.children.size();i++)
      {
        TreeNode<Integer> temp=maxSumNode(root.children.get(i));
        int sum1=temp.data;
        for(int j=0;j<temp.children.size();j++)
        {
          sum1+=temp.children.get(j).data;
        }
        int sum=max.data;
        for(int k=0;k<max.children.size();k++)
        {
          sum+=max.children.get(k).data;
        }
        if(sum1>sum)
        {
          max=temp;
        }
      }
      return max;
      
	}
	
		
}
