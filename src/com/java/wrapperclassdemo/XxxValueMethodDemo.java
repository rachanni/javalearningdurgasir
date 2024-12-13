package com.java.wrapperclassdemo;

public class XxxValueMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i=Integer.valueOf(130);
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		Character ch=Character.valueOf('a');
		System.out.println(ch.charValue());
		Boolean b1=Boolean.valueOf("durga");
		System.out.println(b1.booleanValue());

	}

}
