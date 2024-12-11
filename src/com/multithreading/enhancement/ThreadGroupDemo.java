package com.multithreading.enhancement;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		ThreadGroup g=new ThreadGroup("First name");
		System.out.println(g.getParent());
	}

}
