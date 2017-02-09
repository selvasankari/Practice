package com.chella.practice.datastructure;

public class StackUsingLinkedList {

	
	StackNode next=null; StackNode first=null;

	public static void main(String args[])
	{
		StackUsingLinkedList st = new StackUsingLinkedList();

		    st.push(50);
		    st.push(70);
		    st.push(190);
		    st.displayList();
		    st.pop();
		    st.displayList();
		
	}
	
	public void push(int data) {
		StackNode n = new StackNode(data);
	    n.next = first;
	    first = n;
	}
	
	public StackNode pop() {
		StackNode temp = first;
	    first = first.next;
	    return temp;
	}
	
	public void displayList() {
		StackNode current = first;
	    while (current != null) {
	    	System.out.println(current.data);
	    	current=current.next;
	
	    }
	}
}

class StackNode {
	StackNode next;
	StackNode first;
	int data;

	public StackNode(int data) {
	this.data=data;
	}
}
