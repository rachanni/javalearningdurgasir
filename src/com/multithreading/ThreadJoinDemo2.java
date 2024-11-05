package com.multithreading;

class MyThread2 extends Thread{
	
	static Thread mt;
	public void run() {
		try {
			mt.join();
		}catch(InterruptedException e) {}
		
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
}
public class ThreadJoinDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
	    MyThread2.mt=Thread.currentThread();
		MyThread2 t=new MyThread2();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
		

	}

}
