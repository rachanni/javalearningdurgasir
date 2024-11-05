package com.multithreading;


class MyThread11 extends Thread{
	
}
public class GetSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(15);
//		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		MyThread t=new MyThread();
		System.out.println(t.getPriority());

	}

}
