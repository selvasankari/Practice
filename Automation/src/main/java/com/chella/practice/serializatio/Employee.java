package com.chella.practice.serializatio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.poi.util.SystemOutLogger;

public class Employee implements Serializable {

	public int id;
	public transient int age;
	public String name;

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
	
		return String.format(id + " k " + name + " "+age);
	}

	public static void main(String args[]) {
		Employee e = new Employee(1, "chella", 29);
		e.serializable();
		e.deserializable();
System.out.println(e.toString());
	}
	


	public void serializable() {
		Employee emp = new Employee(1, "chella", 29);

		try {

			FileOutputStream fileout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(emp);
			out.close();
			fileout.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	


	public void deserializable() {
		try {

			FileInputStream fin = new FileInputStream("f.txt");
			ObjectInputStream in = new ObjectInputStream(fin);

			Employee e = (Employee) in.readObject();
System.out.println(e.toString());
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.age);
			in.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
