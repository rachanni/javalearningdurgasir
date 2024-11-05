package com.multithreading;



public class WithSingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime=System.currentTimeMillis();
		
		
		for(int i=0;i<100000;i++) {
			System.out.print("Main Thread");
		}
		
		
		for(int i=0;i<100000;i++) {
			System.out.print("Main Thread");
		}
		
		System.out.println();
		long endTime=System.currentTimeMillis();
		
		long timeTaken=endTime-startTime;
		
		System.out.println(timeTaken);
		

	}

}
