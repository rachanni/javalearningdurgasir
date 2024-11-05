package com.exception.handling;



public class Test {

	
	void test1() {
		int i=9/0;
	}
	
	void test2() {
		test1();
	}
	
	void test3() {
		try {
			test2();
			System.out.println("000000000");
		}catch(Exception e) {
			
		}
	}
	
	void test4() {
		test3();
		System.out.println("______________");
	}
	
	void test5() {
		test4();
		System.out.println("*************");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		t.test5();
		System.out.println("9999999999");
		
	}

}
