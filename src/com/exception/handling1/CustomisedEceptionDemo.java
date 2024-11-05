package com.exception.handling1;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	TooYoungException(String s) {
		super(s);
	}
}

class TooOldException extends RuntimeException{
	public TooOldException(String s) {
		super(s);
	}
}
public class CustomisedEceptionDemo {

	public static void main(String[] args) {
		
		
		Scanner scn =new Scanner(System.in);
	    int age=scn.nextInt();
		if(age>60) {
			throw new TooYoungException("Plz wait some more time you will get best "
					+ "match soon");
		}else if(age<18) {
			throw new TooOldException("Too late ...no chance of getting married");
		}else {
			System.out.println("You will get match detail soon through mail");
		}
		

	}

}
