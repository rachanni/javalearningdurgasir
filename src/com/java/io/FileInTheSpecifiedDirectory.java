package com.java.io;

import java.io.File;
import java.io.IOException;

public class FileInTheSpecifiedDirectory {

	public static void main(String[] args) throws IOException {
		
		File f=new File("durga123");
		f.mkdir();
		
//		What will happen if already durga123 directory is available in the current working directory
		
		File f1=new File("durga123","demo.txt");
		f1.createNewFile();
		
	}
}
