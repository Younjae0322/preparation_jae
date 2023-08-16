package com.javalab.sec03.Car;

import java.util.Scanner;

public class CarMain {
	static Scanner scanner = new Scanner(System.in);
	public static Car[] kia = new Car[17];

	public static void main(String[] args) {
		specificationTable();
		brandMenu();
	}
	public static void brandMenu() {
		System.out.println("======================================================================");
		System.out.println("어서오세요. 기아자동차 차량 정보 조회 사이트입니다.");
		System.out.println("======================================================================");
		systemMenu();
	}
	public static void systemMenu() {
		typeChoice();
		System.out.println("1.경차 | 2.승용차 | 3.전기차 | 4.종료                      (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		
		while(true) {
			if(choiceS == 1 ) {
				kiaNameMenuS();
				break;
			}else if(choiceS == 2 ) {
				kiaNameMenuM();
				break;
			}else if(choiceS == 3) {
				kiaNameMenuE();
				break;
			}else if(choiceS == 4){
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			 	systemMenu();
			 	break;
			}
		}

	}
	public static void kiaNameMenuE() {
		nameChoice();
		System.out.println("1.니로 EV | 2.니로 Plus | 3.EV6 | 4.EV6GT | 5.EV9 | 6.되돌아가기 ");
		System.out.println("                                                     (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		for (Car c : kia) {
			if(choiceS == 1 ) {
				if(c.getEngine().equals("EV") && c.getName().equals("니로EV")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());  }
			} else if(choiceS == 2 ) {
				if(c.getEngine().equals("EV") && c.getName().equals("니로Plus")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());  }
			} else if(choiceS == 3 ) {
				if(c.getEngine().equals("EV") && c.getName().equals("EV6")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());  }
			} else if (choiceS == 4){
				if(c.getEngine().equals("EV") && c.getName().equals("EV6GT")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());  }
			} else if (choiceS == 5 ) {
				if(c.getEngine().equals("EV") && c.getName().equals("EV9")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());  }
			} else if (choiceS == 6 ) {
				systemMenu();
			} else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
		 	kiaNameMenuE();
		}
			systemMenu();
			break;
	}
}
	public static void kiaNameMenuM() {
		nameChoice();
		System.out.println("1.K3 | 2.K3GT | 3.K5 | 4.K8 | 5.K9 | 6.되돌아가기       (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();

		if(choiceS == 1 ) {
			kiaK3EngineM();
	 } else if(choiceS == 2 ) {
		 kiaK3gtEngineM();
	 } else if(choiceS == 3 ) {
		 kiaK5EngineM();
	 } else if (choiceS == 4){
		 kiaK8EngineM();
	 } else if (choiceS == 5 ) {
		 kiaK9EngineM();
	 } else if (choiceS == 6 ) {
		 systemMenu();
	 } else {
		 System.out.println("잘못된 선택입니다. 다시 선택하세요.");
		 kiaNameMenuM();
	 }
	}
	public static void kiaNameMenuS() {
		nameChoice();
		System.out.println("1.Morning | 2.Ray | 3.되돌아가기                        (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		
		   if(choiceS == 1) {
			 kiaMorningEngineS();
		 } else if(choiceS == 2) {
			 kiaRayEngineS();
		 } else if(choiceS == 3) {
			 systemMenu();
		 } else {
			 System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			 kiaNameMenuS();
		 }
				
	}
	public static void kiaK9EngineM() {
		engineChoice();
		System.out.println("1.가솔린 3.3 터보| 2.가솔린 3.8 | 3. 되돌아가기              (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		for (Car c : kia) {
			if(choiceS == 1 ) {
				if(c.getEngine().equals("가솔린 3.3 터보") && c.getName().equals("K9")){
				System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());  }
			}else if(choiceS == 2 ) {
				if(c.getEngine().equals("가솔린 3.8") && c.getName().equals("K9")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
							, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
							, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
							c.getPrice());  }
			}else if(choiceS == 3) {
				kiaNameMenuM();
			}else {
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
		    	kiaK9EngineM();
			}
			systemMenu();
			break;
		}
		
	}
	public static void kiaK8EngineM() {
		engineChoice();
		System.out.println("1.가솔린 2.5 | 2.가솔린 3.5 | 3. 되돌아가기                 (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		for (Car c : kia) {
			if(choiceS == 1 ) {
				if(c.getEngine().equals("가솔린 2.5") && c.getName().equals("K8")){
				System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());  }
			}else if(choiceS == 2 ) {
				if(c.getEngine().equals("가솔린 3.5") && c.getName().equals("K8")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
							, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
							, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
							c.getPrice());  }
			}else if(choiceS == 3) {
				kiaNameMenuM();
			}else {
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
		    	kiaK8EngineM();
			}
			systemMenu();
			break;
		}
	}
	public static void kiaK5EngineM() {
		engineChoice();
		System.out.println("1.가솔린 1.6 터보 | 2.가솔린 2.0 | 3.LPI 2.0 | 4.하이브리드 2.0 | 5. 되돌아가기");
		System.out.println("                                                     (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		for (Car c : kia) {
			if(choiceS == 1 ) {
				if(c.getEngine().equals("가솔린 1.6 터보") && c.getName().equals("K5")){
				System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
						, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
						, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
						c.getPrice());  }
			}else if(choiceS == 2 ) {
				if(c.getEngine().equals("가솔린 2.0") && c.getName().equals("K5")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
							, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
							, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
							c.getPrice());  }
			}else if(choiceS == 3 ){
				if(c.getEngine().equals("LPI 2.0") && c.getName().equals("K5")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
							, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
							, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
							c.getPrice());  }
		    }else if(choiceS == 4) {
		    	if(c.getEngine().equals("하이브리드 2.0") && c.getName().equals("K5")){
					System.out.printf("차량이름 : %s \n차량엔진 : %s \n전장 : %dmm \n전폭 : %dmm \n전고 : %dmm \n축거 : %dmm \n배기량 : %dcc \n가격 : %d만원"
							, c.getName(), c.getEngine(), c.getLength(), c.getWidth()
							, c.getHeight(), c.getWheelbase(), c.getDisplacement(),
							c.getPrice());  }
		    }else if(choiceS == 5) {
		    	kiaNameMenuM();
		    }else {
		    	System.out.println("잘못된 선택입니다. 다시 선택하세요.");
		    	kiaK5EngineM();
		    }

	}	
}
	public static void kiaK3gtEngineM() {
		engineChoice();
		System.out.println("1.가솔린 1.6 | 2.되돌아가기                               (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		
		if(choiceS == 1 ) {
			k3();
		}else if(choiceS == 2) {
			kiaNameMenuM();
		}else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			kiaK3EngineM();
		}
	}
	public static void kiaK3EngineM() {
		engineChoice();
		System.out.println("1.가솔린 1.6 | 2.되돌아가기                               (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		
		if(choiceS == 1 ) {
			k3();
		}else if(choiceS == 2 ) {
			kiaNameMenuM();
		}else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			kiaK3EngineM();
		}
		
	}
	public static void kiaRayEngineS() {
		engineChoice();
		System.out.println("1.가솔린 1.0 | 2.되돌아가기                               (숫자만 입력가능합니다.)");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		
		if(choiceS == 1 ) {
			ray();
		}else if(choiceS == 2 ) {
			kiaNameMenuS();
		}else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			kiaRayEngineS();
		}
	}
	public static void kiaMorningEngineS() {
		engineChoice();
		System.out.println("1.가솔린 1.0 | 2.되돌아가기                              (숫자만 입력가능합니다.) ");
		System.out.println("======================================================================");
		System.out.print("선택> ");
		int choiceS = scanner.nextInt();
		
		if(choiceS == 1 ) {
			morning();
		}else if(choiceS == 2 ) {
			kiaNameMenuS();
		}else {
			System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			kiaMorningEngineS();
		}   
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
		systemMenu();
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
		systemMenu();
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
		systemMenu();
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
		systemMenu();
	}
	public static void engineChoice() {
		System.out.println("[차량의 엔진타입을 선택하세요.]");
		System.out.println("======================================================================");
	}
	public static void nameChoice() {
		System.out.println("[차량의 이름을 선택하세요.]");
		System.out.println("======================================================================");
	}
	public static void typeChoice() {
		System.out.println("[차량의 종류를 선택하세요.]");
		System.out.println("======================================================================");
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
	}
}
