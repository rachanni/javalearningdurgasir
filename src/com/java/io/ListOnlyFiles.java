package com.java.io;


//write  a program to list only file in the specified directory
import java.io.File;

public class ListOnlyFiles {
	
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\asus\\eclipse-workspace\\javalearningdurgasir");
		
		String []s=f.list();
		for(String s1:s) {
			File f1=new File(f,s1);
			if(f1.isFile()) {
				System.out.println(s1);
			}else {
				
//				kuch nahi
			}
		}
		
	}

}
