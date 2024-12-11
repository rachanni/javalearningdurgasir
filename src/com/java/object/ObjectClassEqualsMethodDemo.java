package com.java.object;
// .equals() method present in Object class is meant to reference comparison of an object.

class Student1{
	String name;
	int rollono;
	
	public Student1(String name, int rollno) {
		this.name=name;
		this.rollono=rollno;
		
	}
	
	public boolean equals(Object obj) {
		try {
		String name1=this.name;
		int rollno1=this.rollono;
		Student1 s=(Student1)obj;
		String name2=s.name;
		int rollno2=s.rollono;
		if(name1.equals(name2)&&rollno1==rollno2) {
			return true;
		}else {
			return false;
		}
	}catch(ClassCastException e) {return false;}
	 catch(NullPointerException e) {return false;}
	}
}
public class ObjectClassEqualsMethodDemo {

	public static void main(String[] args) {
		
		Student1 s1=new Student1("Durga",101);
		Student1 s2=new Student1("Ravi",102);
		Student1 s3=new Student1("Durga",101);
		Student1 s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		/*
		 * s1 is object of type Student and s2 is String object "Durga". In our overriden equals() method 
		 * both argument s1 and s2 is expected to be an object of type Student.
		 * And we can not typecast String object to Student object becfause there is no relation such child to Parent or Parent to child etc.
		 * So we are getting Exception in thread "main" java.lang.ClassCastException.
		 * We have to handle this exception.
		 */
		System.out.println(s1.equals("Durga"));
		
		/*
		 * s1 is an object of type Student and s2 is null. So as per our code 
		Student1 s=(Student1)obj;
		String name2=s.name;  // hey null what is your name
		int rollno2=s.rollono; // hey null what is your rollno
		So this will raise NullPointerException.
		Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "s" is null
		

		 */
		System.out.println(s1.equals(null));

	}

}
