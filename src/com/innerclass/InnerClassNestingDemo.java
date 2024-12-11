package com.innerclass;

class A{
	class B{
		class C{
			public void m1() {
				System.out.println("Innermost class method");
			}
		}
	}
}
public class InnerClassNestingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		A.B b=a.new B();
		A.B.C c=b.new C();
		c.m1();
		
		

	}

}
