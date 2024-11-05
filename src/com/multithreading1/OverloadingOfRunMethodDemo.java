package com.multithreading1;

class MyThread1 extends Thread{
	
	public void start() {
		super.start();
		System.out.println("start-method");
	}
	
	public void run() {
		System.out.println("run-method");
	}
}
public class OverloadingOfRunMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 t=new MyThread1();
		t.start();
		t.start(); 
		System.out.println("main-method");

	}

}
