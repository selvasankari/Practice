package com.chella.practice.datastructure;

public class TreeNode {

	TreeNode left;
	TreeNode right;
	int data;

	public TreeNode(int data) {
		this.data = data;
	}

	public TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2, new TreeNode(6), new TreeNode(7));
		root1.right = new TreeNode(5, new TreeNode(8), new TreeNode(9));
		
		TreeNode a = new TreeNode(1);
		a.left= new TreeNode(2, new TreeNode(4), new TreeNode(5));
		a.right= new TreeNode(3, new TreeNode(6), new TreeNode(7));
		
		TreeNode b = new TreeNode(1);
		b.left= new TreeNode(2, new TreeNode(4), new TreeNode(5));
		b.right= new TreeNode(3, new TreeNode(6), new TreeNode(7));
		
		//root.display(root);
		root.display(a);
		System.out.println(root.size(root1));
		System.out.println(root.size(root));
		System.out.println(root.size(a));
		System.out.println(root.identicalTreeCheck(a, b));

	}
	
	public void display(TreeNode root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
		display(root.left);
	
		display(root.right);
	}}
	
	public int size(TreeNode root)
	{
		if(root!=null)
		{
	
			return 1+ size(root.left) + size(root.right);
		}
		return 0;
	}
	
	public boolean identicalTreeCheck(TreeNode a, TreeNode b)
	{
		
		if(a== null && b== null)
			return true;
		
		if(a!= null && b!= null)
		{
			return (a.data == b.data )&&
				(identicalTreeCheck(a.left, b.left)) &&
				identicalTreeCheck(a.right, b.right) ;
		
	
		}
		return false;
	}
	
}
