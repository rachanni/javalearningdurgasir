package com.annonymousarray;


interface Outer{
	public void m1();
	interface Inner{
		public void m2();
	}
		
}

class Test2 implements Outer.Inner{
	public void m2() {
		System.out.println("Inner interface method implementation");
	}
}

class Test1 implements Outer{
	public void m1() {
		System.out.println("Outer interface method implementation");
	}
}
// top level class
public class InterfaceInsideInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		t1.m1();
		t2.m2();

	}

}
