package com.java.object;

class Student{
	String name;
	int rollno;
	
	public Student(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
//	public String toString() {
//		return name+"....."+rollno;
//	}
	
}
public class ObjectClassToStringDemo {

	public static void main(String[] args) {
		
		Student s1=new Student("Durga",101);
		Student s2=new Student("Ravi",102);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
