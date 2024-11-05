package com.multithreading1;


class MyThread4 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread4 t=new MyThread4();
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}

	}

}
