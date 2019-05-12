import java.util.LinkedList;
import java.util.Scanner;
public class TreeRemoveLeafNodes 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

	TreeNode<Integer> root = createGenericTree();
		printLevelWise(root);
		TreeNode<Integer>result= removeLeafNodes(root);
		printLevelWise(result);
		
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
	public static void printLevelWise(TreeNode<Integer> root)
    {
		LinkedList<TreeNode<Integer>> queue = new LinkedList<>();
		int count=-1;
		queue.addLast(root);
		queue.addLast(null);
		while(!queue.isEmpty())
		{
			TreeNode<Integer>current=queue.removeFirst();
			if(current!=null)
			{
				count=-1;
				System.out.print(current.data+" ");
				for(int i=0;i<current.children.size();i++)
				{
					queue.addLast(current.children.get(i));
					
				}			
			}
			else
			{
				System.out.println();
				queue.addLast(null);
				if(count==0)
				{
					break;
				}
					count=0;
				
			}
		}
    }
	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root)
	{
		{
			if(root==null)
			{
				return null;
			}
			if(root.children.size()==0)
			{
				return null;
			}
			for(int i=root.children.size()-1; i>=0;i--)
			{
				TreeNode<Integer>current=removeLeafNodes(root.children.get(i));
				if(current==null)
				{
					root.children.remove(i);
				}
			}
			return root;
		}
	}
}