package com.exception.handling1;

public class PrintExceptionInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("----------");
			System.out.println(e);
			System.out.println("---------");
			System.out.println(e.toString());
			System.out.println("--------------");
			System.out.println(e.getMessage());
		}

	}

}
