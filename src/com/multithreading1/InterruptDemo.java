package com.multithreading1;

class MyThread7 extends Thread{
	
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("I am lazy thread");
		
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
	}
}
public class InterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread7 t=new MyThread7();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");

	}

}
