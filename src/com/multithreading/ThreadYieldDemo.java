package com.multithreading;

class MyThread1111 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class ThreadYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1111 t=new MyThread1111();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main Thread");
		}
		
	}

}
