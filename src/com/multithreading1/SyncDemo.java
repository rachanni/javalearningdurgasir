package com.multithreading1;

class Display{
	public synchronized
	void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("Good morning: ");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(name);
	  }
	}
}

class MyThread8 extends Thread{
	
	
	Display d;
	String name;
	MyThread8(Display d, String name){
		this.d=d;
		this.name=name;
	}
	
//	job of the thread is to call wish() method
//	to call wish() method we need object of Display and name as parameter
//	so with the help of ctor we fulfill our both need
	public void run() {
		d.wish(name);
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		MyThread8 t1=new MyThread8(d, "Dhoni");
		MyThread8 t2=new MyThread8(d, "Yuvraj");
		t1.start();
		t2.start();
		
		

	}

}
