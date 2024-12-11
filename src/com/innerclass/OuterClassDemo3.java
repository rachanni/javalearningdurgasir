package com.innerclass;


class Outer{
	class Inner{
		public void m1() {
			System.out.println("Inner class method");
		}
	}
}
public class OuterClassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o=new Outer();
		
//		Accessing inner class code from outside of outer class
		Outer.Inner i=o.new Inner();
		i.m1();

	}

}
