package com.javalab.day0824.exam01;


public class DriverMain {

	public static void main(String[] args) {
		// 1. 다형성 없이 각자의 메소드로 운행
		Bus bus = new Bus();
		bus.run();
		
		Taxi taxi = new Taxi();
		taxi.run();
		System.out.println();
		
		// 2. 다형성으로 운행
		Driver driver = new Driver();
		driver.drive(bus);
		driver.drive(taxi);
		System.out.println();
		
		// 3. 배열을 통해서 자동 운행
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = bus;
		vehicles[1] = taxi;
		for(Vehicle vehicle : vehicles) {
			vehicle.run();
		}
	}

}
