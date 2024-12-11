package com.innerclass;

public class OuterClassDemo2 {

	class Inner{
		public void m1() {
			System.out.println("Inner class method");
		}
	}
	
	// Accessing inner class code from instance area of Outer class
	public void m2() {
		Inner i=new Inner();
		i.m1();
	}
	
	public static void main(String[]args) {
		OuterClassDemo2 o=new OuterClassDemo2();
		o.m2();
	}
}
