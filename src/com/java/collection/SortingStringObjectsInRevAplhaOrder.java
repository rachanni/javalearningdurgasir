package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class SortingStringObjectsInRevAplhaOrder {

	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator8());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}
}

class MyComparator8 implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		String s1=obj1.toString();
		String s2=(String)obj2;
		
		return -s1.compareTo(s2);
		
	}
	
}
