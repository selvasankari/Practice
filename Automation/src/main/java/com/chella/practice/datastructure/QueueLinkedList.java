package com.chella.practice.datastructure;

class Node {
	public int item;
	public Node next;

	public Node(int val) {

		item = val;
	}

	public void displayNode() {
		System.out.print("[" + item + "]");
	}
}

class LinkList {
	private Node start;
	private Node end;

	public LinkList() {
		start = null;
		end = null;
	}

	public boolean isEmpty() {
		return start == null;
	}
	public void insertEnd(int item)
	{
		Node newnode = new Node(item);
		if(isEmpty())
		{
			start =newnode;
		}
		else
		{
			end.next=newnode;
			end=newnode;
		}
	}
	
	public int deleteStart(){
		int temp = start.item;
		
		if(start == end)
		{
			start=null;
			end =null;
		}
		else
		{
		start =start.next;
		}
		return temp;
		
	}
	
	 public void displayList(){
	        Node current = start;
	        while(current != null)
	        {
	            current.displayNode();
	            current = current.next;
	        }
	        System.out.println("");
	    }
}

class Queue 
{
	private LinkList listObj;
	public Queue(){
        listObj = new LinkList(); 
    }
    public boolean isEmpty(){ 
        return listObj.isEmpty(); 
    }
    public void insert(int k){ 
        listObj.insertEnd(k); 
    }
    public int delete(){ 
        return listObj.deleteStart(); 
    }
    public void display(){
        System.out.print("Queue [start to end]: ");
        listObj.displayList();
    }
}

public class QueueLinkedList {
	 public static void main(String[] args){ 
	        Queue demo = new Queue();
	        System.out.println("Inserting two elements into the queue");
	        demo.insert(10);
	        demo.insert(20);
	        demo.display();
	        System.out.println("Inserting one more element into the queue at the end");
	        demo.insert(30);
	        demo.display();
	        System.out.println("Deleting one element from the front");
	        demo.delete();
	        demo.display(); 
	    } 

}
