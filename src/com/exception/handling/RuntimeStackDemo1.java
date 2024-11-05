package com.exception.handling;

// Runtime stack mechanism demo in case of 
public class RuntimeStackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doStuff();
		System.out.println(10/0);

	}
	
	public static void doStuff() {
		
		doMoreStuff();
		System.out.println("Hi");
	}
	public static void doMoreStuff() {
		System.out.println("Hello");
	}

}
