package com.multithreading1;

public class SleepDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
			System.out.println("Slide : "+i);
			Thread.sleep(5000);
		}

	}

}
