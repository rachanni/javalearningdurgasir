package com.array;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object []a=new Object[10];
		a[0]=new Object();
		a[1]=new String("Durga");
		a[2]=new Integer(10);
		
		for(Object o:a) {
			System.out.println(o);
		}

	}

}
