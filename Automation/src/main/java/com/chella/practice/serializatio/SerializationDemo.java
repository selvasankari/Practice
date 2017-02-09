package com.chella.practice.serializatio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String args[]) throws IOException
	{
		Employee emp= new Employee (1, "chella", 29);
		
		try {
			
			FileOutputStream fileout =new FileOutputStream("f.txt");
			ObjectOutputStream out= new ObjectOutputStream(fileout);
			out.writeObject(emp);
			out.close();
			fileout.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
