package com.javalab.day0815;

public class AppliancesMain {
	public static Appliances[] appliances = new Appliances[10];

	public static void main(String[] args) {
		initData();
		washer();
		addPay();
		expensive();
		expensivePay();
	}
	
	public static void initData() {
		appliances[0] = new Appliances(1, "자전거", 250000);
		appliances[1] = new Appliances(2, "노트북", 1250000);
		appliances[2] = new Appliances(3, "쌀", 150000);
		appliances[3] = new Appliances(4, "세탁기", 800000);
		appliances[4] = new Appliances(5, "시금치", 2500);
		appliances[5] = new Appliances(6, "대파", 10000);
		appliances[6] = new Appliances(7, "에어컨", 3500000);
		appliances[7] = new Appliances(8, "쇼파", 3000000);
		appliances[8] = new Appliances(9, "우유", 2500);
		appliances[9] = new Appliances(10, "운동화", 600000);

	}
	public static void washer() {
		for(Appliances app : appliances) {
			if(app.getName().equals("세탁기")) {
				System.out.println("1. 세탁기 제품의 가격은 " + app.getPay() + "원 입니다.");
			}
		}
		System.out.println();
	}
	public static void addPay() {
		int sum = 0;
		for(Appliances app : appliances) {
			sum += app.getPay();
		}
		System.out.println("2. 구매하신 모든 제품의 총액은 " + sum + "원 입니다.");
		System.out.println();
	}
	public static void expensive() {
		System.out.println("3. 100만원이 넘는 고가의 제품은 다음과 같습니다.");
		for(Appliances app : appliances) {
			if(app.getPay() > 1000000) {
				System.out.println("-----------------------------------------------------");
				System.out.println("제품ID : " + app.getId() + "\t 제품name : " 
			                     + app.getName() + "\t 제품가격 : " + app.getPay() + "입니다." );
			}
		}
		System.out.println("-----------------------------------------------------");
		System.out.println();
	}
	public static void expensivePay() {
		int sum = 0;
		int i = 0;
		for(Appliances app : appliances) {
			if(app.getPay() > 1000000) {
				sum += app.getPay();
				i++;				
			}
		}
		System.out.println("4. 100만원이 넘는 제품의 수량은 " + i + "개 이며 합계 금액은 : " + sum + "입니다.");
		
	}
}
