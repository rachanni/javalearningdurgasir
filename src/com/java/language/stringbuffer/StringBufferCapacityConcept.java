package com.java.language.stringbuffer;

public class StringBufferCapacityConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append("q");
		System.out.println(sb.capacity());

	}

}
