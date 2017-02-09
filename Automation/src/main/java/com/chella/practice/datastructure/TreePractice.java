package com.chella.practice.datastructure;

import net.sourceforge.htmlunit.corejs.javascript.Node;

public class TreePractice {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)),
				new TreeNode(3, new TreeNode(6), new TreeNode(7)));

		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2, new TreeNode(6), new TreeNode(7));
		root1.right = new TreeNode(5, new TreeNode(8), new TreeNode(9));

		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
		a.right = new TreeNode(3, new TreeNode(6), new TreeNode(7));

		TreeNode b = new TreeNode(1);
		b.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
		b.right = new TreeNode(3, new TreeNode(6), new TreeNode(7));

		// root.display(root);
		TreePractice treePractice = new TreePractice();
		treePractice.display(a);
		System.out.println(treePractice.size(root1));
		System.out.println(treePractice.size(root));
		System.out.println(treePractice.size(a));
		System.out.println(treePractice.identicalTreeCheck(a, b));

		// Tree Traversal

		System.out.println("PreOrder Traversal");
		treePractice.preOrder(root);

		System.out.println("InOrder Traversal");
		treePractice.inOrderTraversal(root);

		// Postorder traversal is used to delete the tree and to get the postfix
		// expression of an expression.

		System.out.println("Post Order Traversal");
		treePractice.postOrderTraversal(root);

		// Height of the tree

		System.out.println("Height of the tree is " + treePractice.heightOfTree(root));
		// print all nodes at a given level
		System.out.println("Nodes at given level ");
		treePractice.printNodesAtGivenLevel(root, 3);

		// printLevelorder - Breadth first traversal

		System.out.println("printLevelorder");
		treePractice.levelOrder(root);

		// delete a tree
		System.out.println("Deleting tree");
		treePractice.deleteTree(root);
		// root=null;

		System.out.println("Post Order Traversal");
		treePractice.postOrderTraversal(root);

		// mirror of a tree
		System.out.println("Mirror of the tree");
		treePractice.mirror(root);

		System.out.println("Post Order Traversal");
		treePractice.postOrderTraversal(root);

		// check if binary tree is full or not

		System.out.println("check if binary tree is full or not");
		TreeNode halfbinarytree = new TreeNode(1, new TreeNode(2, new TreeNode(4), null),
				new TreeNode(3, new TreeNode(6), new TreeNode(7)));
		System.out.println(treePractice.isBinaryTreeFull(halfbinarytree));

		System.out.println(treePractice.isBinaryTreeFull(root));

		// Symmetric tree (mirror image or itself
		System.out.println("Symmetric tree (mirror image or itself");
		TreeNode symm_node = new TreeNode(1);
		symm_node.left = new TreeNode(2);
		symm_node.right = new TreeNode(2);
		symm_node.left.left = new TreeNode(3);
		symm_node.left.right = new TreeNode(4);
		symm_node.right.left = new TreeNode(4);
		symm_node.right.right = new TreeNode(3);
		System.out.println("printLevelorder");
		treePractice.levelOrder(symm_node);

		System.out.println(treePractice.symmetricTree(symm_node));

		// count of leaf nodes in a binary tree
		System.out.println("count of leaf nodes in a binary tree : " +treePractice.getLeafCount(root));

	}
	
	public int getLeafCount(TreeNode root)
	{
		if(root==null)
			return 0;
		if (root.left == null && root.right == null)
            return 1;
        else
            return getLeafCount(root.left) + getLeafCount(root.right);
		
	}

	public boolean symmetricTree(TreeNode root) {
		if (root == null)
			return true;
		;
		return isMirror(root, root);

	}

	public boolean isMirror(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null)
			return true;

		if (node1 != null && node2 != null && node1.data == node2.data)
			return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
		return false;
	}
	// check if binary tree is full or not

	/*
	 * To check whether a binary tree is a full binary tree we need to test the
	 * following cases:-
	 * 
	 * 1) If a binary tree node is NULL then it is a full binary 2) If a binary
	 * tree node does have empty left and right sub-trees, then it is a full
	 * binary tree by definition 3) If a binary tree node has left and right
	 * sub-trees, then it is a part of a full binary tree by definition. In this
	 * case recursively check if the left and right sub-trees are also binary
	 * trees themselves. 4) In all other combinations of right and left
	 * sub-trees, the binary tree is not a full binary
	 */

	public Boolean isBinaryTreeFull(TreeNode root) {
		if (root == null)
			return true;
		if (root.left == null && root.right == null)
			return true;
		if (root.left != null && root.right != null)
			return (isBinaryTreeFull(root.left) && isBinaryTreeFull(root.right));

		return false;
	}

	public TreeNode mirror(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode left = mirror(root.left);
		TreeNode right = mirror(root.right);

		root.left = right;
		root.right = left;
		return root;
	}

	public void deleteTree(TreeNode root) {
		if (root == null)
			return;

		deleteTree(root.left);
		deleteTree(root.right);
		System.out.println("Root node" + root.data + " is deleted");
		root = null;

	}

	public void levelOrder(TreeNode root) {
		int h = heightOfTree(root);

		for (int i = 1; i <= h; i++) {
			printNodesAtGivenLevel(root, i);
		}
	}

	// print all nodes at a given level
	public void printNodesAtGivenLevel(TreeNode root, int level) {
		if (root == null)
			return;

		if (root != null && level == 1) {
			System.out.println(root.data);
		} else {
			if (root.left != null && root.right != null) {
				printNodesAtGivenLevel(root.left, level - 1);
				printNodesAtGivenLevel(root.right, level - 1);
			}
		}

	}

	// Height of the tree

	public int heightOfTree(TreeNode root) {
		if (root == null)
			return 0;
		

		int ltree = heightOfTree(root.left);
		int rtree = heightOfTree(root.right);
		if (ltree > rtree)
			return 1 + ltree;
		else
			return 1 + rtree;
	}

	public void postOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data);
	}

	public void inOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}

	public void preOrder(TreeNode root) {
		if (root == null)
			return;

		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);

	}

	public void display(TreeNode root) {
		if (root != null) {
			System.out.println(root.data);
			display(root.left);

			display(root.right);
		}
	}

	public int size(TreeNode root) {
		if (root != null) {

			return 1 + size(root.left) + size(root.right);
		}
		return 0;
	}

	public boolean identicalTreeCheck(TreeNode a, TreeNode b) {

		if (a == null && b == null)
			return true;

		if (a != null && b != null) {
			return (a.data == b.data) && (identicalTreeCheck(a.left, b.left)) && identicalTreeCheck(a.right, b.right);

		}
		return false;
	}

	static class TreeNode {
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
		
		//Common Ancestor 
		
		//given an sorted arrat , form a binary tree
		//Balanced binary tree
		
		
	}
}
