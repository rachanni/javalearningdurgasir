package com.multithreading1;


class MyThread3 extends Thread{
	
}
public class GetPrioritySetPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		MyThread3 t=new MyThread3();
		System.out.println(t.getPriority());
		t.setPriority(10);
		System.out.println(t.getPriority());
		t.setPriority(15);
	}

}

