package com.multithreading1;

class MyThread5 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Seetha Thread");
		}
		
//		try {
//		Thread.sleep(10000);
//		}catch(InterruptedException e) {
//			
//		}
		
		
		
	}
}
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread5 t=new MyThread5();
		t.start();
//		t.join();
//		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("Ram thread");
		}

	}

}
