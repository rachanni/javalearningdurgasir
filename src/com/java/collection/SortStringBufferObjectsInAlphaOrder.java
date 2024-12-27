package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class SortStringBufferObjectsInAlphaOrder {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator10());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}
}


class MyComparator10 implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		return s1.compareTo(s2);
		
	}
	
	
}