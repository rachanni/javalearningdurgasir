package com.java.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	
	public static void main(String[] args) {
		
		
		LinkedHashSet l=new LinkedHashSet();
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("Z");
		l.add(null);
		l.add(10);
		System.out.println(l.add("z"));
		System.out.println(l.add("Z"));
		System.out.println(l);
		
	}
}
