package com.info.boeing;

public class Singleton {

	private static Singleton instance;

	private Singleton() {} // Prevent direct instantiation

	public static synchronized Singleton getInstance() {
	if (instance == null) {
	instance = new Singleton(); // Create only once
	}
	return instance;
	}

	public void showMessage() {
	System.out.println("Singleton instance in action!");
	}
	}

	class Test {
	public static void main(String[] args) {
	Singleton obj1 = Singleton.getInstance();
	Singleton obj2 = Singleton.getInstance();
	System.out.println(obj1 == obj2); // true
	}
}
