package com.annonymousarray;

// Outer class or top level class
public class StaticNestedClassDemo {

	static class Nested {
		public void m1() {
			System.out.println("Static nested class method");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nested n=new Nested();
		n.m1();
		

	}

}
