package com.javalab.sec01.school;

/**
 * 실행클래스
 * 현재 모습은 모듈화까지 진행된 모습임
 * 처음에는 main메소드에서 모두 진행하고 나중에 각 메소드로 모듈화하고
 * 최종적으로 학생 데이터를 만들어주는 부분도 메소드로 분리할것.
 * 
 [학생명단]
  학번			주민번호			이름	 학년	  주소		학과
"1292001", "900424-1825409", "김광식", 3, "서울", 92
"1292002", "900305-1730021", "김정현", 3, "서울", 20
"1292003", "891021-2308302", "김현정", 4, "대전", 55
"1292301", "890902-2704012", "김현정", 2, "대구", 78
"1292303", "910715-1524390", "박광수", 3, "광주", 54
"1292305", "921011-1809003", "김우주", 4, "부산", 88
"1292501", "900825-1506390", "박철수", 3, "대전", 73
"1292502", "911011-1809003", "백태성", 3, "서울", 95
 */
public class StudentMain {
	// 학생 객체 생성
	public static Student[] students = new Student[8];

	public static void main(String[] args) {

		// 학생 데이터를 생성해주는 메소드를 만드세요.
		initData();

		//[문제.1] 학생 목록을 출력하는 메소드를 만드세요.
		printStudent();
		
		//[문제.2] 여학생들의 명단을 출력하시오.
		printWomanStudent();
		
		//[문제.3] 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고 
		// 반환받은 이름을 main 메소드에서 출력하세요.
		String[] strName = getSeoulStudent(); // 반환받은 문자열 배열 저장 변수 선언
		for (String str : strName) {
			System.out.println(str);
		}
	}

	private static void initData() {
		students[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920);
		students[1] = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 923);
		students[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 920);		
		students[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 923);
		students[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 925);
		students[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 920);
		students[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 925);
		students[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 923);		
	}	
	
	// 전학생 목록 출력 메소드
	private static void printStudent() {
		System.out.println("1. 전체 학생 목록");
		System.out.printf("======================================================\n");
		System.out.printf("  학번        주민번호     이름   학년     주소    학과코드  \n");
		System.out.printf("======================================================\n");
		for (Student student : students) {
			System.out.println(student.getId() + "\t" 
								+ student.getJumin() + "\t" 
								+ student.getName() + "\t" 
								+ student.getYear() + "\t" 
								+ student.getAddress() + "\t" 
								+ student.getDepartment());
		}
		System.out.printf("======================================================\n");		
		System.out.println();		
	}	
	
	// 여학생 목록 출력 메소드
	private static void printWomanStudent() {
		System.out.println("2. 여학생 목록");
		System.out.printf("======================================================\n");
		System.out.printf("  학번        주민번호     이름   학년     주소    학과코드    \n");
		System.out.printf("======================================================\n");		
		for (Student student : students) {
			if(student.getJumin().substring(7, 8).equals("2")) {
				System.out.println(student.getId() + "\t" 
									+ student.getJumin() + "\t" 
									+ student.getName() + "\t" 
									+ student.getYear() + "\t" 
									+ student.getAddress() + "\t" 
									+ student.getDepartment());
			}
		}		
		System.out.println();		
	}	
	
	// 서울 사는 3학년 학생들 이름을 구해서 반환하는 메소드
	private static String[] getSeoulStudent() {
		System.out.println("3. 서울 사는 3학년 명단");
		String arrName = "";	// 서울 3학년생들의 이름을 이어붙일 String type 변수
		for (Student student : students) {
			if(student.getAddress().equals("서울") && student.getYear() == 3) { //서울 사는 3학년
				arrName = arrName + student.getName() + ",";	// 예) 홍길동,이명수,정명훈,
			}			
		}
		String[] resultName = arrName.split(",");
		return resultName;
	}

}