package com.multithreading1;

class MyThread6 extends Thread{
	
	static Thread mt;
	
	public void run() {
		
		try {
		mt.join();
		}catch(InterruptedException e) {
			
		}
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class JoinDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread6.mt=Thread.currentThread();
		MyThread6 t=new MyThread6();
		t.start();
		t.join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			
		}
		Thread.sleep(10000);

	}

}
