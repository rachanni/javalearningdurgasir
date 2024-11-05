package com.multithreading;

class MyThread1 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print("Child Thread");
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		MyThread1 t=new MyThread1();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.print("Main Thread");
		}
		
		System.out.println();
		long endTime=System.currentTimeMillis();
		
		long timeTaken=endTime-startTime;
		
		System.out.println(timeTaken);

	}

}
