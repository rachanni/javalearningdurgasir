package com.innerclass;

public class OuterClassDemo4 {

	int x=10;
	static int y=20;
	class Inner{
		
//		Accessing both static and non-static member of Outer class inside inner class directly
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		
		OuterClassDemo4 o=new OuterClassDemo4();
		OuterClassDemo4.Inner i=o.new Inner();
		i.m1();

	}

}
