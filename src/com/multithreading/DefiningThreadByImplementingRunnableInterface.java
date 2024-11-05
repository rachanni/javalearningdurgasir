package com.multithreading;


class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child - Thread");
		}
	}
}
public class DefiningThreadByImplementingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnable r=new MyRunnable();
		Thread t1=new Thread();
		Thread t2=new Thread(r);
		r.run();
		for(int i=0;i<10;i++) {
			System.out.println("Parent - Thread");
		}
	}

}
