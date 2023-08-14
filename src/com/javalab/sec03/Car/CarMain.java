package com.javalab.sec03.Car;

import java.util.Scanner;

public class CarMain {
	Scanner scanner = new Scanner(System.in);
	public static Car[] kia = new Car[100];
	//모닝,레이 엔진 (가솔린 1.0) K3,K3GT (가솔린 1.6)

	public static void main(String[] args) {
		specificationTable();
		systemMenu();

	}
	public static void systemMenu() {
		System.out.println("[정보를 보고 싶은 차량의 종류를 선택하시오.]");
		System.out.println("==============================================");
		System.out.println("1.경차 | 2.승용 | 3.EV | 4.");
		System.out.println("==============================================");

	}
	
	//제원 표 호출
	public static void specificationTable() {
		kia[0] = new Car("경차", "Morning","가솔린 1.0", 3595, 1595, 1485, 2400, 998, 1315);
		kia[1] = new Car("경차", "Ray", "가솔린 1.0", 3595, 1595, 1700, 2520, 998, 1390);
		kia[2] = new Car("승용", "K3", "가솔린 1.6", 4645, 1800, 1440, 2700, 1598, 1825);
		kia[3] = new Car("승용", "K3GT", "가솔린 1.6", 4515, 1800, 1440, 2700, 1591, 2784);
		kia[4] = new Car("승용", "K5", "가솔린 1.6 터보", 4905, 1860, 1445, 2850, 1598, 2497);
		kia[5] = new Car("승용", "K5", "가솔린 2.0", 4905, 1860, 1445, 2850, 1999, 2418);
		kia[6] = new Car("승용", "K5", "LPI 2.0", 4905, 1860, 1445, 2850, 1999, 2715);
		kia[7] = new Car("승용", "K5", "하이브리드 2.0", 4905, 1860, 1445, 2850, 1999, 2985);
		kia[8] = new Car("승용", "K8","가솔린 2.5", 5015, 1875, 1455, 2895, 2497, 3343);
		kia[9] = new Car("승용", "K8","가솔린 3.5", 5015, 1875, 1455, 2895, 3470, 3684);
		kia[10] = new Car("승용", "K9","가솔린 3.8", 5140, 1915, 1490, 3105, 3778, 5815);
		kia[11] = new Car("승용", "K9","가솔린 3.3 터보", 5140, 1915, 1490, 3105, 3342, 6468);
		kia[12] = new Car("EV", "니로EV","EV", 4420, 1825, 1570, 2720, 64, 5114); //배기량 대신 	배터리용량
		kia[13] = new Car("EV", "니로Plus","EV", 4385, 1805, 1640, 2700, 64, 4600);
		kia[14] = new Car("EV", "EV6","EV", 4680, 1880, 1550, 2900, 58, 5130);
		kia[15] = new Car("EV", "EV6GT","EV", 4695, 1890, 1545, 2900, 77, 7584);
		kia[16] = new Car("EV", "EV9","EV", 5010, 1980, 1755, 3100, 100, 7728);
		kia[17] = new Car("EV", "봉고3 EV","EV", 5115, 1805, 1640, 2700, 64, 4600);
		
	}
}
