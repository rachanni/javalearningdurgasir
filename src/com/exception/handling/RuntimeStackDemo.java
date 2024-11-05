package com.exception.handling;

public class RuntimeStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doStuff();

	}
	
	public static void doStuff() {
		doMoreStuff();
	}
	
	public static void doMoreStuff() {
		System.out.println("Hello!");
	}

}
