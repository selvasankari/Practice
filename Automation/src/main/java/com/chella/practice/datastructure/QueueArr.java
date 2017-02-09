package com.chella.practice.datastructure;

import java.util.NoSuchElementException;

public class QueueArr {
	public int qarr[];
	public int rear;
	public int front;
	public int size;
	public int len;

	QueueArr(int n) {

		len = 0;
		size = n;
		front = -1;
		rear = -1;
		qarr = new int[n];

	}

	public void insert(int item) {
		if (front == -1) {
			front = 0;
			rear = 0;
			qarr[rear] = item;
			len = 1;
		}

		else {
			if (rear + 1 >= size)
				throw new IndexOutOfBoundsException("Over flow exception");
			else {
				rear++;
				qarr[rear] = item;
				len++;
			}

		}
	}

	public void display() {
		System.out.println(" queue :  ");
		if (len == 0)
		{
			System.out.println("Empty");
		return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.println(qarr[i]);
		}

	}

	public void remove() {
		if (front == -1)
			throw new IndexOutOfBoundsException();

		else {
			len--;
			if (front == rear) {
				rear = -1;
				front = -1;
			} else

			{
				System.out.println("The removed element in the queue is " + qarr[front]);
				front++;
			}
		}
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return front == 0 && rear == size - 1;
	}

	public int getSize() {
		return len;
	}

	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return qarr[front];
	}

	public static void main(String args[]) {

		QueueArr obj = new QueueArr(3);
		
	
		obj.display();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.display();
	
		obj.remove();obj.display();
		obj.remove();
		obj.remove();obj.display();
	

	}

}
