import java.util.Scanner;

//1 3 20 1 90 1 150 0 3 2 50 17 1000 0 2000 0 3000 0 4000 0 5000 0 6000 0 7000 0 85 0 86 0 87 0 88 0 89 0 92 0 93 0 94 0 95 0 96 0 6 1 80 0 40 1 100 1 83 0

public class TreeNextLargerElementInTree {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		printGenericTree(root);
		int n=s.nextInt();
		TreeNode<Integer> max=findNextLargerNode(root,n);
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
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
	     TreeNode<Integer>ans=null;
	      int y=Integer.MAX_VALUE;
	      if(root.data>n)
	      {
	        ans=root;
	        y=root.data;
	      }
	    	for(int i=0;i<root.children.size();i++)
			{
				TreeNode<Integer>temp=findNextLargerNode(root.children.get(i),n);
	          	if(temp!=null)
	            {
	              if(temp.data<y)
	              {
	                ans=temp;
	                y=temp.data;
	              }
	            }
	        }
	      return ans;
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