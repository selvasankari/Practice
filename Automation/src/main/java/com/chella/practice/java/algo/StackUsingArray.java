package com.chella.practice.java.algo;

public class StackUsingArray {
	private int top;
	int size;
	int[] stack;

	public StackUsingArray(int stack_size) {
		size = stack_size;
		top = -1;
		stack = new int[size];

	}

	public void push(int item) {
		if (top == size - 1) {
			System.out.println("The stack is full");
		} else {
			top = top + 1;
			stack[top] = item;
		}
	}

	public void isEmpty() {
		if (top == -1) {
			System.out.println("the stack is empty");
		}
	}

	public void peek() {
		System.out.println("the top element is " + stack[top]);
	}

	public void pop() {
		if (top == -1) {
			System.out.println("The stack is empty");
		} else {
			int item = stack[top];
			top--;
			//System.out.println("The popped element is " + stack[top]);
		}
	}

	public void display() {
		if (top == -1)
			System.out.println("Stack is empty");
		else {
			System.out.println("The elements in the stack are ");
			for (int i = top; i >= 0; i--) {
				System.out.print( stack[i]);
			}
		}
	}

	public static void main(String args[]) {
		StackUsingArray obj = new StackUsingArray(5);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.display();

		obj.peek();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.display();
	}
}
