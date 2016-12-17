package com.chella.practice.java;

public class ClassicSingleton {
	private static ClassicSingleton instance = null;

	private ClassicSingleton() {

	}

	public static ClassicSingleton getInstance() {
		if (instance == null) {
			return new ClassicSingleton();
		}
		return instance;
	}

	public static void printDemo() {
		System.out.println("SingletonDemo");
	}
}
