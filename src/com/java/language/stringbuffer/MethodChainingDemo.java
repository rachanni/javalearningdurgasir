package com.java.language.stringbuffer;

public class MethodChainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer();
		sb.append("durga").append("software").append("solution").insert(2, "xyz").reverse().delete(2, 10);
		System.out.println(sb);
			

	}

}
