package com.chella.practice.java.thread;

public class Basic {

	public static void main(String args[]) {
		Basic b= new Basic();
		//b.sleepMethod();
		b.isAliveMethod();
		b.joinMethod();
		
	}



public void sleepMethod()
{
	FirstThread obj = new FirstThread();
	Thread t = new Thread(obj);
	t.start();
	
	try {
		Thread.sleep(0);
		System.out.println("");
	} catch (InterruptedException e) {

	}
	System.out.println(obj.count);
}

public void isAliveMethod()
{
	FirstThread t = new FirstThread();
	Thread t1= new Thread(t);
	t1.start();
	
			while(t1.isAlive())
		{
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
			System.out.println("Is Alive Method count value " + t.count);
		}
	
	

public void joinMethod()
{
	FirstThread t = new FirstThread();
	Thread t2 = new Thread(t);
	t2.start();
	
	try
	{
		t2.join();
	}
	catch(InterruptedException e)
	{
		System.out.println(e.getMessage());
	}

	System.out.println("Join Method count value " + t.count);
	}
}
	



class FirstThread implements Runnable {
	int count;

	public void run() {
		for (int i = 0; i < 200; i++) {
			count++;

		}

		System.out.println("Finished Printing");
	}
}
