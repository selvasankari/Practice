package com.chella.practice.java.interfac;

 class AnonymousClass1 {

	public void read() {
		System.out.println("Normal Class Example");
	}
}

public class AnonymousClass {

	public static void main(String args[]) {
		AnonymousClass1 anobj = new AnonymousClass1() {
			public void read() {
				System.out.println("anonymous Class");
			}
		};

		anobj.read();
		AnonymousClass1 an= new AnonymousClass1();
		an.read();

	}

}
