package com.exception.handling1;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Statement 1");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println(10/2);
		}
		
		System.out.println("Statement 3");

	}

}
