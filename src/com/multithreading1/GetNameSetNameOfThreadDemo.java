package com.multithreading1;


class MyThread2 extends Thread{
	
}
public class GetNameSetNameOfThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		MyThread2 t=new MyThread2();
		System.out.println(t.getName());
		Thread.currentThread().setName("Pawan Kalyan");
		System.out.println(Thread.currentThread().getName());

	}

}

