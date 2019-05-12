import java.util.Scanner;
import java.util.LinkedList;

//10 3 20 2 40 0 50 0 30 0 40 0

public class TreePrintLevelWise {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		TreeNode<Integer> root = createGenericTree();
		printLevelWise(root);
		
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
		/*LinkedList<TreeNode<Integer>> queue = new LinkedList<>();
		int root_data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(root_data);
		queue.addLast(root);
		while(queue.isEmpty())
		{
			TreeNode<Integer> currentNode = queue.removeFirst();
			System.out.println("Enter no. of children "+currentNode.data);
			int noOfChildren = s.nextInt();
			for(int i=0;i<noOfChildren;i++)
			{
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				queue.addLast(child);
				currentNode.children.add(child);
			}
		}
		return root;*/
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
}
