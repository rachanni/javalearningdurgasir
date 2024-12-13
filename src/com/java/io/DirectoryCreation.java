package com.java.io;

import java.io.File;

public class DirectoryCreation {
	
	public static void main(String[] args) {
		
		File f=new File("durga123");
		System.out.println(f.exists());
//		will create directory named durga123 in the current working directory
		f.mkdir();
//		to get path to current working directory
		System.out.println(System.getProperty("user.dir"));

		System.out.println(f.exists());
	}

}
