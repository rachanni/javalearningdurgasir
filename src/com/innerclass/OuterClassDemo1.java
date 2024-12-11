package com.innerclass;

public class OuterClassDemo1 {

	class Inner{
		public void m1() {
			System.out.println("Inner class method");
		}
	}
	
	public static void main(String[]args) {
		OuterClassDemo1 o=new OuterClassDemo1();
		
		// create inner class object
		// Inner i =new Inner(); Compilation error
		// Accessing inner class code from static area of Outer class
		OuterClassDemo1.Inner i=o.new Inner();
		i.m1();
	}

}
