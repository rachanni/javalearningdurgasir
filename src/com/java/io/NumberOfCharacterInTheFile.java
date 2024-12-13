package com.java.io;

import java.io.File;

public class NumberOfCharacterInTheFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	check number of character present in the file demo.txt in durga123 directory. 
//		C:\Users\asus\eclipse-workspace\javalearningdurgasir\durga123
		
		File f=new File("durga123","demo.txt");
		
//		return number of charater present in the file
		Long l=f.length();
		System.out.println(l);
//		checking durga123 is file or directory.
//		checking demo.txt is file or directory
		System.out.println(f.isFile());
		
		

	}

}
