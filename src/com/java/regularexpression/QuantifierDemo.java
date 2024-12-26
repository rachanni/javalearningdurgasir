package com.java.regularexpression;

import java.util.regex.Pattern;
import java.util.regex.*;

public class QuantifierDemo {

	
	public static void main(String[] args) {
		
		
		int i=0;
		
		String[]s= {"a","a+","a*","a?"};
		
		while(i<s.length) {
		Pattern p=Pattern.compile(s[i]);
		Matcher m=p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
		i++;
		System.out.println("@@@@@@@@@@@@@@");
		
	}
	}
}
