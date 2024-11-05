package com.multithreading;

class MyThread extends Thread{
	
	public void run() {
		System.out.println("run method executed by Thread: "+Thread.currentThread().getName());
	}
}
public class DefiningThreadByExtendingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyThread t=new MyThread();
		t.start();
		System.out.println("main method executed by Thread: "+Thread.currentThread().getName());
	}

}
