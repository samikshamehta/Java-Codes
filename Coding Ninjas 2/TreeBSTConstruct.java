import java.util.Scanner;


public class TreeBSTConstruct {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		BinaryTreeNode<Integer> root=SortedArrayToBST(arr);
		printTree(root);
	
	}

	// In, Pre, Post Order
	public static void printTree(BinaryTreeNode<Integer> root) 
	{
		if (root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
		printTree(root.left);
		printTree(root.right);
	}
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr)
	{
		int start=0,end=arr.length-1;
		BinaryTreeNode<Integer>root=SortArrayToBST(arr,start,end);
		return root;
	}
	public static BinaryTreeNode<Integer> SortArrayToBST(int[] arr,int start,int end)
	{
		if(start>end)
		{
			return null;
		}
		int mid=(start+end)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
		root.left = SortArrayToBST(arr,start,mid-1);
		root.right = SortArrayToBST(arr,mid+1,end);
		return root;
	}
}