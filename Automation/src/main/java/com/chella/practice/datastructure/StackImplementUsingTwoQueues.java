package com.chella.practice.datastructure;

import java.util.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class StackUsingTwoQueues {

	Queue<Integer> q;
	Queue<Integer> temp;

	public StackUsingTwoQueues() {
		q = new LinkedList<Integer>();
		temp = new LinkedList<Integer>();
	}
	//push - O(n)O(n), pop O(1)O(1)

	public void push(int data) {
		if (q.size() == 0)
			q.add(data);
		else {
			int l = q.size();

			for (int i = 0; i < l; i++) {
				temp.add(q.remove());
			}
			q.add(data);
			for (int i = 0; i < l; i++) {
				q.add(temp.remove());
			}
		}
	}
	
	/** Using one Queue
	
	public void push(int x) {
    q1.add(x);
    int sz = q1.size();
    while (sz > 1) {
        q1.add(q1.remove());
        sz--;
    }
}
	 */

	public int pop() {

		if (q.size() == 0)
			throw new NoSuchElementException("Under flow Exception");
		else
			return (q.remove());

	}

	public int getSize() {
		return q.size();
	}

	public boolean isEmpty() {
		return q.size() == 0;
	}

	public void display() {
		System.out.println("Stack : ");
		int l = q.size();
		if (l == 0)
			System.out.println("Queue Empty");
		else {
			Iterator ite = q.iterator();
			while (ite.hasNext())

			{
				System.out.print(ite.next());
			}
			System.out.println();

		}
	}
}

public class StackImplementUsingTwoQueues {

	public static void main(String args[]) {
		StackUsingTwoQueues sq = new StackUsingTwoQueues();
		sq.display();
		sq.push(1);
		sq.display();
		sq.pop();
		sq.display();
		sq.push(1);
		sq.push(2);
		sq.push(3);
		sq.display();
		sq.pop();
		sq.display();

	}

}
