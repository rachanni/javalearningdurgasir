package com.java.language.string.method;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("durga");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		String s4=s2.toLowerCase();
		String s5=s4.toUpperCase();

	}

}
