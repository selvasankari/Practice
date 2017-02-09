package com.chella.practice.java.algo;

public class QueueUsingArray<T> {

	private int rear;
	private int front;
	int size;
	int[] queue;

	public QueueUsingArray(int queue_size) {
		rear = -1;
		front = -1;
		size = queue_size;
		queue = new int[size];
	}

	public void insert(int item) {
		if (rear == -1) {
			rear = 0;
			front = 0;
			queue[rear] = item;
		} else if (rear + 1 >= size) {
			System.out.println("The queue is full");
		} else {
			rear++;
			queue[rear] = item;
		}

	}

	public int remove() {
		int item=0;

		if (front == -1)
			System.out.println("queue is empty");
		else {
			item = queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else
				front++;

		}
		return item;
	}
	
	public void display()
	{
		if(front ==-1 && rear==-1)
			System.out.println("Queue is empty");
		else
			for(int i=front ; i<=rear; i++)
			{
				System.out.println(queue[i]);
			}
	}
	
	public static void main(String args[])
	{
		QueueUsingArray<Integer> int_obj = new QueueUsingArray<Integer>(3);
		int_obj.insert(1);
		int_obj.insert(2);
		int_obj.display();
		int_obj.remove();
		int_obj.display();
		int_obj.remove();
		int_obj.remove();
		
	}

}
