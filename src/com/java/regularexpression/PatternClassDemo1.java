package com.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClassDemo1 {

	
	public static void main(String[] args) {
		
		int i=0;
		
		String [] s= {"[abc]","[^abc]","[a-z]","[0-9]","[a-zA-Z0-9]","[^a-zA-Z0-9]"};
		
		while(i<s.length) {
			
	
		
		Pattern p=Pattern.compile(s[i]);
		Matcher m=p.matcher("a3b#k@9z");
		i++;
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		   }
		System.out.println();
		
		}
	}
}
