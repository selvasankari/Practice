package com.chella.practice.serializatio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		
		try {
			
			FileInputStream fin = new FileInputStream("f.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			
			Employee e =(Employee)in.readObject();
			
			System.out.println(e.id);
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
