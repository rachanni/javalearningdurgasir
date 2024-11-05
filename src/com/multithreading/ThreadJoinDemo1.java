package com.multithreading;


class MyThread11111 extends Thread{
	
	public void run()  {
		for(int i=0;i<10;i++) {
			System.out.println("Seetha Thread");
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
			
		}
	}
}
public class ThreadJoinDemo1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		MyThread11111 t=new MyThread11111();
		t.start();
		
//		Parent thread main will wait until the finishing of Child Thread
		t.join();
		for(int i=0;i<10;i++) {
			System.out.println("Rama Thread");
		}
		

	}

}
