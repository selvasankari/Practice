package com.chella.practice.datastructure;

import java.util.Stack;

import org.apache.xalan.xsltc.compiler.sym;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueUsingStack {

	Stack<Integer> s;
	Stack<Integer> temp;

	public QueueUsingStack() {
		
		s = new Stack<Integer>();
		temp = new Stack<Integer>();

	}
	
	public void insert(int data)
	{
		if(s.size()==0)
		{
			s.push(data);
		}
		else
		{
			int l= s.size();
			for(int i=0; i<l; i++)
			{
			temp.push(s.pop());
			}
			s.push(data);
			
			for(int i=0; i<l; i++)
			{
				s.push(temp.pop());
			}
}
	}
	
	public int remove(){
		if(s.size()==0)
			throw new NoSuchElementException("Underflow exception");
		else
			 return s.pop();
	}
	
	public void display()
	{
		System.out.println("Queue : ");
		int l= s.size();
		if(l==0)
			System.out.println("Queue empty");
		
		for(int i=l-1; i>=0;i--)
		{
			System.out.println(s.get(i));
		}
	}
	
	 public int peek()
	    {
	        if (s.size() == 0)
	            throw new NoSuchElementException("Underflow Exception");            
	        return s.peek();
	    }  
	 public boolean isEmpty()
	 {
		 return s.size()==0;
	 }

	 public int getSize()
	 {
		 return s.size();
	 }
	 
	 public static void main(String args[])
	 {
		 QueueUsingStack qu = new QueueUsingStack();
		 qu.display();
		 qu.insert(1);
		 qu.display();
		 qu.remove();
		 qu.display();
		 qu.insert(1);
		 qu.insert(2);
		 qu.insert(3);
		 qu.display();
		 qu.remove();
		 qu.display();
	 }
}
