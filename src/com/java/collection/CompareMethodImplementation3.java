package com.java.collection;
	import java.util.Comparator;
	import java.util.TreeSet;


public class CompareMethodImplementation3 {

	
	
	



		
		

		

		

			
			public static void main(String[] args) {
				
				
				TreeSet t=new TreeSet(new MyComparator3());
				t.add(10);
				t.add(0);
				t.add(15);
				t.add(5);
				t.add(20);
				t.add(20);
				System.out.println(t);
			}
		}

		class MyComparator3 implements Comparator{

			@Override
			public int compare(Object obj1, Object obj2) {
				// TODO Auto-generated method stub
				
				Integer I1=(Integer)obj1;
				Integer I2=(Integer)obj2;
				
				
				return I2.compareTo(I1);
			}
			
		}




