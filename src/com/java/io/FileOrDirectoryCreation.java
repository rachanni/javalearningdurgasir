package com.java.io;

import java.io.File;
import java.io.IOException;

public class FileOrDirectoryCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		create a file named with abc.txt in the current working directory
		File f=new File ("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
//		to get path to current working directory
		System.out.println(System.getProperty("user.dir"));
		System.out.println(f.exists());

	}

}
