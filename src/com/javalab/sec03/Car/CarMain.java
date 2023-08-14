package com.javalab.sec03.Car;

public class CarMain {
	public static Car[] kia = new Car[14];
	//모닝,레이 엔진 (가솔린 1.0) K3,K3GT (가솔린 1.6)

	public static void main(String[] args) {
		specificationTable();

	}
	
	//제원 표 호출
	public static void specificationTable() {
		kia[0] = new Car("경차", "Morning","가솔린 1.0", 3595, 1595, 1485, 2400, 998, 1315);
		kia[1] = new Car("경차", "Ray", "가솔린 1.0", 3595, 1595, 1700, 2520, 998, 1390);
		kia[2] = new Car("승용", "K3", "가솔린 1.6", 4645, 1800, 1440, 2700, 1598, 1825);
		kia[3] = new Car("승용", "K3GT", "가솔린 1.6", 4515, 1800, 1440, 2700, 1591, 2784);
		kia[4] = new Car("승용", "K5", "가솔린 1.6 터보",4515, 1800, 1440, 2700, 1591, 2418);
		kia[5] = new Car("승용", "K5", "가솔린 2.0", 4515, 1800, 1440, 2700, 1591, 2784);
		kia[6] = new Car("승용", "K3GT"," ", 4515, 1800, 1440, 2700, 1591, 2784);
		
	}
}
