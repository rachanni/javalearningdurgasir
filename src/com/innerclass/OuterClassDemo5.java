package com.innerclass;

public class OuterClassDemo5 {

	int x=10;
	class Inner{
		int x=100;
		public void m1() {
			int x=1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Inner.this.x);
			System.out.println(OuterClassDemo5.this.x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClassDemo5 o=new OuterClassDemo5();
		OuterClassDemo5.Inner i=o.new Inner();
		i.m1();

	}

}
