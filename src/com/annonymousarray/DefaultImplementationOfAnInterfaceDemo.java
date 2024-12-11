package com.annonymousarray;


interface Vehicle{
	public int getNoOfWheels();
	
	class DefaultVehicle implements Vehicle{
		public int getNoOfWheels() {
			return 2;
		}
	}
}

class Bus implements Vehicle{
	public int getNoOfWheels() {
		return 6;
	}
}
public class DefaultImplementationOfAnInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle.DefaultVehicle d=new Vehicle.DefaultVehicle();
		System.out.println(d.getNoOfWheels());
		Bus b=new Bus();
		System.out.println(b.getNoOfWheels());

	}

}
