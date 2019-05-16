import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class CodingContestCountingLeaf {
	TreeNode root;
	static public class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}
	public TreeNode createTree(int[] arr, int n)
	{
		TreeNode[] created = new TreeNode[n];
	        for (int i = 0; i < n; i++) 
	            created[i] = null;
	  
	        for (int i = 0; i < n; i++)
	            createNode(arr, i, created);
	  
	        return root;
	  }
	 void createNode(int arr[], int i, TreeNode created[]) 
	 {
	        if (created[i] != null)
	            return;
	  	        created[i] = new TreeNode(i);
	  	        if (arr[i] == -1) 
	  	        {
	  	        	root = created[i];
	  	        	return;
	  	        }
	  	        if (created[arr[i]] == null)
	  	        createNode(arr,arr[i], created);
	  	        TreeNode p = created[arr[i]];
	  	        if (p.left == null)
	  	          	p.left = created[i];
	  	        	else  
	  	        	p.right = created[i];
	}	
	public TreeNode delete(TreeNode root,int node)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==node)
		{
			return root=null;
		}
		root.left=delete(root.left,node);
		root.right=delete(root.right,node);
		return root;
	}
	 static public int CountAllLeaves(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null&&root.right==null)
		{
			return 1;
		}
		return CountAllLeaves(root.left)+CountAllLeaves(root.right);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		CodingContestCountingLeaf result=new CodingContestCountingLeaf();
		int node=s.nextInt();
		result.root=result.createTree(arr, n);
		if(result.root.data==node)
		{
			result.root=null;
		}
		else
		{
			result.delete(result.root,node);
		}
		int ans=CountAllLeaves(result.root);
		System.out.println(ans);
		
	}
}