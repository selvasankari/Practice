package com.chella.practice.datastructure;

import java.util.*;

public class StackDemo {
	int top;
	int[] stack;
	int maxsize;

	public StackDemo(int n) {
		maxsize = n;
		stack = new int[maxsize];
		top = -1;

	}

	// Pushes element onto the stack. element is also returned.
	public void push(int data) {
		
		
		stack[++top] = data;
	}

	// Returns the element on the top of the stack, removing it in the process.
	public int pop() {
		return stack[top--];
	}

	// Returns the element on the top of the stack, but does not remove it.
	public int peek() {
		return stack[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return top == maxsize - 1;
	}

	public static void main(String args[]) {
		StackDemo st = new StackDemo(10);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		

		while (!st.isEmpty()) {
			int data = st.pop();
			System.out.println(data);

		}

	}

}
