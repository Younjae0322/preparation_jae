package com.javalab.day0824.exam02;

interface Vehicle{
	void run();
}

class Driver{
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverMain {

	public static void main(String[] args) {
		// 1. 버스 익명 구현 객체 생성
		Vehicle bus = new Vehicle() {
			@Override
			public void run() {
				System.out.println("버스가 달립니다.");
			}
		};
		
		Vehicle taxi = new Vehicle() {
			@Override
			public void run() {
				System.out.println("택시가 달립니다.");
			}
		};
		bus.run();
		taxi.run();
		System.out.println();
	}

}
