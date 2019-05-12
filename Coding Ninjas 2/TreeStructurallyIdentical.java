import java.util.Scanner;


public class TreeStructurallyIdentical {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root1 = createGenericTree();
		printGenericTree(root1);
		TreeNode<Integer> root2 = createGenericTree();
		printGenericTree(root2);
		boolean max=checkIdentical(root1,root2);
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
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2)
	{
      	if(root1.data!=root2.data)
		{
          return false;
        }  
		boolean ans=false;
		for(int i=0;i<root1.children.size()&&i<root2.children.size();i++)
		{
              ans=checkIdentical(root1.children.get(i), root2.children.get(i));
              if(ans==false)
              {
                return false;
              }
        }
		return true;
	}
}
