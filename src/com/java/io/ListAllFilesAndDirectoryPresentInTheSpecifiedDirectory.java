package com.java.io;

import java.io.File;

public class ListAllFilesAndDirectoryPresentInTheSpecifiedDirectory {
	
	public static void main(String[] args) {
		
		int count=0;
		File f=new File("C:\\Users\\asus\\eclipse-workspace\\javalearningdurgasir\\durga123");
		String[] listOfFiles= f.list();
		for(String l:listOfFiles) {
			
			count++;
			System.out.println(l);
		}
		System.out.println("Number of files present at location C:\\Users\\asus\\eclipse-workspace\\javalearningdurgasir\\durga123: "+count);
	}

}
