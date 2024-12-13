package com.java.io;

import java.io.File;

public class ListOnlyDirectory {

	
	public static void main(String[] args) {
		
//		count number of directory at the given path and list out only directory at given location
		int count=0;
		File f=new File("C:\\Users\\asus\\eclipse-workspace\\javalearningdurgasir");
		String []s=f.list();
		for(String s1:s) {
			
			File f1=new File(f,s1);
			
			if(f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}else {
//				kuch nahi
			}
			
		}
		System.out.println("Number of directory present at the given locatiuon: "+count);
	}
}
