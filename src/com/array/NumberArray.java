package com.array;

public class NumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number []n=new Number[10];
		n[0]=new Integer(10);
		n[1]=new Double(10.5);
		n[2]=new Float(20.3);
		
		//n[2]=new String("Durga");
		
		for(Number n1:n) {
			System.out.println(n1);
		}
		
		

	}

}
