package com.chella.practice.datastructure;

class BSTNode {
	int key;
	BSTNode left, right;

	public BSTNode(int item) {
		key = item;
		left = right = null;
	}

}

public class BinarySearchTree {
	BSTNode root;
	int index = 0;

	BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	public BSTNode insertRec(BSTNode root, int data) {
		if (root == null) {
			root = new BSTNode(data);
			return root;
		}
		if (data < root.key)
			root.left = insertRec(root.left, data);
		else if (data > root.key)
			root.right = insertRec(root.right, data);

		return root;
	}

	public void inOrder() {
		inOrderRec(root);
	}

	int size() {
		return size(root);
	}

	public int size(BSTNode root) {
		if (root != null) {
			return 1 + size(root.left) + size(root.right);
		}
		return 0;
	}

	public void inOrderRec(BSTNode root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}

	public void copyBST(BSTNode root, int arr[]) {
		if (root == null)
			return;
		copyBST(root.left, arr);
		arr[index] = root.key;
		index++;
		copyBST(root.right, arr);

	}

	public boolean checkBST(int len) {
		return checkBST(root, len);
	}

	public boolean checkBST(BSTNode root, int len) {
		int[] arr = new int[len];
		copyBST(root, arr);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1])
				return false;
		}
		return true;
	}
	
	public BSTNode arrToBST(int arr[], int start, int end)
	{
		if(start >end)
			return null;
		
		int middle = (start +end) /2;
		BSTNode node = new BSTNode(arr[middle]);
		node.left= arrToBST(arr, start, middle-1);
		node.right= arrToBST(arr, middle+1, end);
		
		return node;
		
	}

	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(80);

		tree.insert(80);
		tree.inOrder();
		int len = tree.size();
		int arr[] = new int[len];
		System.out.println(tree.checkBST(len));
		
		////given an sorted arrat , form a binary  search tree
		 int bst_arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
		
		BSTNode arr_to_bst = tree.arrToBST(bst_arr, 0, bst_arr.length-1);
		tree.inOrderRec(arr_to_bst);

	}
}
