package com.java.language.string.method;
// Custom immutable class
final  class Test{
	private int i;
	Test(int i){
		this.i=i;
		
	}
	public Test modify(int i) {
		if(this.i==i) {
			return this;
		}else {
			return (new Test(i));
		}
	}
}
public class CreateImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1=new Test(10);
		Test t2=t1.modify(100);
		Test t3=t1.modify(10);
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		

	}

}
