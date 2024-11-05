package com.multithreading;

class MyThread111 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class HigherPriorityChildThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread111 t=new MyThread111();
		t.setPriority(10);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main - Thread");
		}

	}

}
