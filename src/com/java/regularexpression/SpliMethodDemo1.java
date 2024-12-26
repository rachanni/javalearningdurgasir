package com.java.regularexpression;

import java.util.regex.Pattern;

public class SpliMethodDemo1 {

	
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[.]");
		String []s=p.split("www.google.com");
		for(String s1:s) {
			System.out.println(s1);
			
		}
	}
}
