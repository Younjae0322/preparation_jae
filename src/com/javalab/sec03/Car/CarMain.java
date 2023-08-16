package com.javalab.sec03.Car;

import java.util.Scanner;

public class CarMain {
	static Scanner scanner = new Scanner(System.in);
	public static Car[] kia = new Car[18];
	//모닝,레이 엔진 (가솔린 1.0) K3,K3GT (가솔린 1.6)

	public static void main(String[] args) {
		specificationTable();
		brandMenu();


	}
	public static void brandMenu() {
		System.out.println("[정보를 보고 싶은 차량의 회사를 선택하세요.]");
		System.out.println("=====================================");
		System.out.println("1. kia | 2. hyundai | 3. 종료");
		System.out.println("=====================================");
		System.out.print("선택> ");
		
		String choiceS = scanner.nextLine();
		while(true) {
			if(choiceS.equals("1") || choiceS.equals("기아") || choiceS.equals("kia")) {
				systemMenu();
				break;
			}else if(choiceS.equals("2") || choiceS.equals("현대") || choiceS.equals("hyundai")) {
				systemMenu();
				break;
			}else if(choiceS.equals("3") || choiceS.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
				break;
			}
		}
	}
	public static void systemMenu() {
		typeChoice();
		System.out.println("1.경차 | 2.승용차 | 3.전기차 | 4.되돌아가기");
		System.out.println("==============================================");
		System.out.print("선택> ");
		String choiceS = scanner.nextLine();
		
		while(true) {
			if(choiceS.equals("경차") || choiceS.equals("1")) {
				kiaNameMenuS();
			}else if(choiceS.equals("승용차") || choiceS.equals("2")) {
				kiaNameMenuM();
			}
		}

	}
	public static void kiaNameMenuM() {
		nameChoice();
		System.out.println("1.K3 | 2.K3GT | 3.K5 | 4.K8 | 5.K9 | 6.되돌아가기");
		System.out.println("==============================================");
		System.out.print("선택> ");
		String choiceS = scanner.nextLine();

		if(choiceS.equals("K3") || choiceS.equals("1") || choiceS.equals("k3")) {
			kiaK3EngineM();
	 } else if(choiceS.equals("K3GT") || choiceS.equals("2")) {
		 kiaK3gtEngineM();
	 } else if(choiceS.equals("K5") || choiceS.equals("3") || choiceS.equals("k5")) {
		 systemMenu();
	 } else if (choiceS.equals("K8") || choiceS.equals("4") || choiceS.equals("k8")){
		systemMenu();
	 } else if (choiceS.equals("K9") || choiceS.equals("5") || choiceS.equals("k9")) {
		 systemMenu();
	 } else if (choiceS.equals("6") || choiceS.equals("되돌아가기")) {
		 kiaNameMenuM();
	 } else {
		 System.out.println("잘못된 선택입니다. 다시 선택하세요.");
		 return;
	 }
	}
	public static void kiaNameMenuS() {
		nameChoice();
		System.out.println("1.Morning | 2.Ray | 3.되돌아가기 ");
		System.out.println("==============================================");
		System.out.print("선택> ");
		String choiceS = scanner.nextLine();
		
			if(choiceS.equals("모닝") || choiceS.equals("1") || choiceS.equals("Morning")) {
				kiaMorningEngineS();
		 } else if(choiceS.equals("레이") || choiceS.equals("2") || choiceS.equals("Ray")) {
			 kiaRayEngineS();
		 } else if(choiceS.equals("3") || choiceS.equals("되돌아가기")) {
			 systemMenu();
		 } else {
			 System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			 return;
		 }
				
	}
	public static void kiaK5EngineM() {
		engineChoice();
		System.out.println("1.가솔린 1.6 | 2.가솔린 2.0 | 3.LPI 2.0 | 4.하이브리드 2.0 | 5. 되돌아가기");
		System.out.println("==============================================");
		System.out.print("선택> ");
		String choiceS = scanner.nextLine();
		
		
	}
	public static void kiaK3gtEngineM() {
		engineChoice();
		System.out.println("1.가솔린 1.6 | 2.되돌아가기 ");
		System.out.println("==============================================");
		System.out.print("선택> ");
		String choiceS = scanner.nextLine();
		
		if(choiceS.equals("1") || choiceS.equals("가솔린")) {
			k3gt();
		}else if(choiceS.equals("2") || choiceS.equals("되돌아가기")) {
			kiaNameMenuM();
		}else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			kiaK3EngineM();
		}
	}
	public static void kiaK3EngineM() {
		engineChoice();
		System.out.println("1.가솔린 1.6 | 2.되돌아가기 ");
		System.out.println("==============================================");
		System.out.print("선택> ");
		String choiceS = scanner.nextLine();
		
		if(choiceS.equals("1") || choiceS.equals("가솔린")) {
			k3();
		}else if(choiceS.equals("2") || choiceS.equals("되돌아가기")) {
			kiaNameMenuM();
		}else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			kiaK3EngineM();
		}
		
	}
	public static void kiaRayEngineS() {
		engineChoice();
		System.out.println("1.가솔린 1.0 | 2.되돌아가기 ");
		System.out.println("==============================================");
		System.out.print("선택> ");
		String choiceS = scanner.nextLine();
		
		if(choiceS.equals("1") || choiceS.equals("가솔린")) {
			ray();
		}else if(choiceS.equals("2") || choiceS.equals("되돌아가기")) {
			kiaNameMenuS();
		}else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			kiaRayEngineS();
		}
	}
	public static void kiaMorningEngineS() {
		engineChoice();
		System.out.println("1.가솔린 1.0 | 2.되돌아가기 ");
		System.out.println("==============================================");
		System.out.print("선택> ");
		String choiceS = scanner.nextLine();
		
		if(choiceS.equals("1") || choiceS.equals("가솔린")) {
			morning();
		}else if(choiceS.equals("2") || choiceS.equals("되돌아가기")) {
			kiaNameMenuS();
		}else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
		}   kiaMorningEngineS();
	}
	public static void morning() {
		for (Car c : kia) {
			if(c.getName().equals("Morning") && c.getEngine().equals("가솔린 1.0")) {
				System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());
			}
		}
		System.out.println();
		brandMenu();
	}
	public static void k3gt() {
		for (Car c : kia) {
			if(c.getName().equals("K3GT") && c.getEngine().equals("가솔린 1.6")) {
				System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());
			}
		}
		System.out.println();
		brandMenu();
		
	}
	public static void k3() {
		for (Car c : kia) {
			if(c.getName().equals("K3") && c.getEngine().equals("가솔린 1.6")) {
				System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());
			}
		}
		System.out.println();
		brandMenu();
		
	}
	public static void ray() {
		for (Car c : kia) {
			if(c.getName().equals("Ray") && c.getEngine().equals("가솔린 1.0")) {
				System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());
			}
		}
		System.out.println();
		brandMenu();
	}
	public static void engineChoice() {
		System.out.println("[차량의 엔진타입을 선택하세요.]");
		System.out.println("==============================================");
	}
	public static void nameChoice() {
		System.out.println("[차량의 이름을 선택하세요.]");
		System.out.println("==============================================");
	}
	public static void typeChoice() {
		System.out.println("[차량의 종류를 선택하세요.]");
		System.out.println("==============================================");
	}
	//제원 표 호출
	public static void specificationTable() {
		kia[0] = new Car("Morning","가솔린 1.0", 3595, 1595, 1485, 2400, 998, 1315);
		kia[1] = new Car("Ray", "가솔린 1.0", 3595, 1595, 1700, 2520, 998, 1390);
		kia[2] = new Car("K3", "가솔린 1.6", 4645, 1800, 1440, 2700, 1598, 1825);
		kia[3] = new Car("K3GT", "가솔린 1.6", 4515, 1800, 1440, 2700, 1591, 2784);
		kia[4] = new Car("K5", "가솔린 1.6 터보", 4905, 1860, 1445, 2850, 1598, 2497);
		kia[5] = new Car("K5", "가솔린 2.0", 4905, 1860, 1445, 2850, 1999, 2418);
		kia[6] = new Car("K5", "LPI 2.0", 4905, 1860, 1445, 2850, 1999, 2715);
		kia[7] = new Car("K5", "하이브리드 2.0", 4905, 1860, 1445, 2850, 1999, 2985);
		kia[8] = new Car("K8","가솔린 2.5", 5015, 1875, 1455, 2895, 2497, 3343);
		kia[9] = new Car("K8","가솔린 3.5", 5015, 1875, 1455, 2895, 3470, 3684);
		kia[10] = new Car("K9","가솔린 3.8", 5140, 1915, 1490, 3105, 3778, 5815);
		kia[11] = new Car("K9","가솔린 3.3 터보", 5140, 1915, 1490, 3105, 3342, 6468);
		kia[12] = new Car("니로EV","EV", 4420, 1825, 1570, 2720, 64, 5114); //배기량 대신 	배터리용량
		kia[13] = new Car("니로Plus","EV", 4385, 1805, 1640, 2700, 64, 4600);
		kia[14] = new Car("EV6","EV", 4680, 1880, 1550, 2900, 58, 5130);
		kia[15] = new Car("EV6GT","EV", 4695, 1890, 1545, 2900, 77, 7584);
		kia[16] = new Car("EV9","EV", 5010, 1980, 1755, 3100, 100, 7728);
		kia[17] = new Car("봉고3 EV","EV", 5115, 1805, 1640, 2700, 64, 4600);
		
	}
}
