package com.java.collection;

import java.util.HashSet;

public class HashSetDemo {

	
	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add("B");
		h.add("C");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}
