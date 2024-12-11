package com.java.object;

import java.lang.reflect.Method;

public class ObjectClassGetClassMethodDemo {

	public static void main(String[] args) {
		
		
		int count =0;
		Object o=new String("Durga");
		Class c=o.getClass();
		System.out.println("Fully qualified name of the class: "+c.getName());
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m) {
			count++;
			System.out.println(m1);
		}
		
		System.out.println("The number of method: "+count);

	}

}
