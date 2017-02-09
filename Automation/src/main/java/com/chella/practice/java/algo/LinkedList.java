package com.chella.practice.java.algo;

import org.apache.xpath.operations.Bool;

public class LinkedList {
	int data;
	LinkedList next;

	LinkedList(int data) {
		this.data = data;
	}

	LinkedList(int data, LinkedList next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		LinkedList start = this;
		while (start != null) {
			sb.append(start.data);
			if (this.next != null) {
				sb.append("->");
				start = start.next;
			}
		}
		sb.setLength(sb.length() - 2);
		return sb.toString();
	}

	public static void main(String args[]) {
		LinkedList node = new LinkedList(1);
		node.next = new LinkedList(2, new LinkedList(3));

		// Looping LinkedList
		LinkedList loopLinkedList = new LinkedList(1);
		loopLinkedList.next = new LinkedList(2);
		loopLinkedList.next.next = new LinkedList(3);
		loopLinkedList.next.next.next = new LinkedList(4);
		loopLinkedList.next.next.next.next = new LinkedList(5);
		loopLinkedList.next.next.next = loopLinkedList.next.next;

		Boolean detectLoop = detectLoop(loopLinkedList);
		printLoop(detectLoop);
		detectLoop = detectLoop(node);
		printLoop(detectLoop);

		// Reverse a LinkedList
		reverseLinkedList(node);

		LinkedList kthNode = new LinkedList(1);
		kthNode.next = new LinkedList(2, new LinkedList(3, new LinkedList(4)));
		System.out.println(kthNode);
		System.out.println(kthNodeFromEnd(kthNode, 2));

	}

	public static void intersectionLinkedList(LinkedList p, LinkedList q) {

		LinkedList node1 = p;
		LinkedList node2 = q;
		
		int node1Len=0; int node2Len=0;
		
		//Length of node1
		while(node1.next!=null)
		{
			node1=node1.next;
			node1Len++;
			
		}
		
		//Length of node2
		while(node2.next!=null)
				{
					node2=node2.next;
					node2Len++;
					
				}
		
		

	}

	public static int kthNodeFromEnd(LinkedList head, int n) {
		LinkedList mainPtr = head;
		LinkedList refPtr = head;
		int count = 1;
		while (refPtr.next != null && count < n) {
			refPtr = refPtr.next;
			count++;
		}

		while (refPtr.next != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		

		return mainPtr.data;
	}

	public static Boolean detectLoop(LinkedList head) {

		if (head == null)
			return null;

		LinkedList fastPtr = head;
		LinkedList slowPtr = head;

		while (fastPtr != null && slowPtr != null && fastPtr.next != null) {

			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if (fastPtr == slowPtr)
			{
				removeLoop(slowPtr);
				return true;
			}

		}

		return false;

	}
	
	public static void removeLoop(LinkedList loopnode)
	{
		loopnode.next=null;
	}
	public static void printLoop(Boolean bool) {
		if (bool)
			System.out.println("There is a LOOP in the LinkedList");
		else
			System.out.println("There is NO LOOP in the LinkedList");

	}

	public static void reverseLinkedList(LinkedList node) {
		LinkedList prev = null;
		LinkedList current = node;
		LinkedList next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		System.out.println(node);
	}

}
