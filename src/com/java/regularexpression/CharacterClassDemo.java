package com.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassDemo {

	public static void main(String[] args) {
		
		String[]s= {"\\s","\\S","\\d","\\D","\\w","\\W","."};
		
		int i=0;
		while(i<s.length) {
			
		
		
		
		
		Pattern p=Pattern.compile(s[i]);
		Matcher m=p.matcher("a7b k@9z");
		while(m.find()) {
			
			System.out.println(m.start()+"..."+m.group());
		}
		System.out.println("########");
		i++;
		
		}

	}

}
