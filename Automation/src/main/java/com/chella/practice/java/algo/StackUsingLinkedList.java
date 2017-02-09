package com.chella.practice.java.algo;

import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;

public class StackUsingLinkedList<T> {

	private int n;
	private Node first;

	private class Node {
		private T item;
		Node next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = first;
		while (temp != null) {
			sb.append(temp.item).append(", ");
			temp = temp.next;

		}
		return sb.toString();

	}

	public void push(T item) {
		Node old = first;
		first = new Node();
		first.item = item;
		first.next = old;

	}

	public T pop() {
		if (first == null)
			new java.util.NoSuchElementException();
		else {
			Node current = first;
			first = first.next;
			return current.item;

		}
		return null;
	}

	public static void main(String args[]) {
		StackUsingLinkedList<String> str_obj = new StackUsingLinkedList<String>();
		StackUsingLinkedList<Integer> int_obj = new StackUsingLinkedList<Integer>();

		str_obj.push("a");
		str_obj.push("b");
		str_obj.push("b");
		str_obj.push("d");
		System.out.println(str_obj.pop());

		int_obj.push(1);
		int_obj.push(2);
		int_obj.push(3);
		int_obj.push(4);
		System.out.println(int_obj.pop());

	}

}
