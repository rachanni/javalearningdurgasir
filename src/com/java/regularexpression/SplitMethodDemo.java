package com.java.regularexpression;

import java.util.regex.Pattern;

public class SplitMethodDemo {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("\\s");
		String[]s=p.split("Durga Software Solutions");
		for(String s1:s) {
			System.out.println(s1);
		}
	}
}
