package com.javalab.sec02.school;

import com.javalab.sec01.school.Student;

public class SchoolManagementMain {

	// 데이터 저장용 배열[필드, 전역변수]
	private static Student[] students = new Student[8];
	private static Professor[] professors = new Professor[6];	
	private static Department[] departments = new Department[3];	
	private static Takes[] takes = new Takes[12];	
	
	public static void main(String[] args) {
		
		// 1. 학사 행정 기초데이터 생성
		initData();
		
		// 2. 학생 관련 정보 출력 메소드 호출
		displayStudent();
		
		// 3. 교수 관련 정보 출력 메소드 호출
		displayProfessor();

		// 4. 학과 관련 정보 출력 메소드 호출
		displayDepartment();
		
		// 5. 성적 관련 정보 출력 메소드 호출
		displayTakes();
		
		// 6. 학생 학과 정보 출력 메소드 호출
		displayStudentDepartment();
		
		// 7. 학생 성적 정보 출력 메소드 호출
		displayStudentTakes();
		
	} // end main

	// 기초 데이터 생성
	private static void initData() {
		// 학생 데이터 생성
		students[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920);
		students[1] = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 923);
		students[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 920);		
		students[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 923);
		students[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 925);
		students[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 920);
		students[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 925);
		students[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 923);	
		
		// 교수 데이터 생성
		professors[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		professors[1] = new Professor("92002", "690702-1350026", "고희석", 923, "교수", "2003");
		professors[2] = new Professor("92301", "741011-2765501", "최성희", 920, "부교수", "2005");		
		professors[3] = new Professor("92302", "750728-1102458", "김태석", 923, "부교수", "1999");
		professors[4] = new Professor("92501", "620505-1200546", "박철재", 925, "교수", "2007");		
		professors[5] = new Professor("92502", "740101-1830264", "장민석", 920, "조교수", "2005");
		
		// 학과 데이터 생성
		departments[0] = new Department(920, "컴퓨터공학과", "201호");
		departments[1] = new Department(923, "산업공학과", "207호");
		departments[2] = new Department(925, "전자공학과", "308호");		
		
		// 성적 데이터 생성
		takes[0] = new Takes("1292001", "C101-01", "B+");
		takes[1] = new Takes("1292001", "C103-01", "A+");
		takes[2] = new Takes("1292001", "C301-01", "A");
		takes[3] = new Takes("1292002", "C102-01", "A");
		takes[4] = new Takes("1292002", "C103-01", "B+");
		takes[5] = new Takes("1292002", "C502-01", "C+");
		takes[6] = new Takes("1292003", "C103-02", "B");
		takes[7] = new Takes("1292003", "C501-02", "A+");
		takes[8] = new Takes("1292301", "C102-01", "C+");
		takes[9] = new Takes("1292303", "C102-01", "C");
		takes[10] = new Takes("1292303", "C103-02", "B+");
		takes[11] = new Takes("1292303", "C501-01", "A+");			
	}	
	
	// 학생 관련 정보 출력 메소드
	private static void displayStudent() {
		// 1. 학생 목록을 출력하는 메소드를 만드세요.
		printStudent();
		
		// 2. 여학생들의 명단을 출력하시오.
		printWomanStudent();
		
		// 3 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고 
		// 반환받은 이름을 main 메소드에서 출력하세요.
		String[] strName = getSeoulStudent(); // 반환받은 문자열 배열 저장 변수 선언
		for (String str : strName) {
			System.out.println(str);
		}		
	}	
	
	// 학생정보 + 성적정보
	private static void displayStudentTakes() {
		System.out.println("================ 6.학생(Student)정보 + 성적(Takes) ==================");
		for(Student s : students) {
			for(Takes t : takes) {
				if(s.getId().equals(t.getId())) {
					System.out.println(s.getId() + "\t " + s.getName() +  "\t" + s.getJumin() +  "\t" + s.getYear() 
                               +  "\t" + s.getAddress() +  "\t" + s.getDepartment() +  "\t" + t.getSubject() 
                               + "\t" + t.getScore());
				}
			}
		}			
	}

	// 학생 정보 + 학과 정보 동시 출력 메소드
	private static void displayStudentDepartment() {
		System.out.println("======================== 5.학생 정보와 소속 학과명 ========================");

		int tempDeptId = 0;
		String deptName = "";
		
		for(Student s : students) {
			tempDeptId = s.getDepartment();		//학생의 학과  id
			for(Department d : departments) {
				if(tempDeptId == d.getId()) {	//학생의 학과 id와 학과 테이블의 학과 id 비교
					deptName = d.getName(); 	//학과명 추출
				}
			}
			System.out.println(s.getId() + "\t " 
								+ s.getName() +  "\t" 
								+ s.getJumin() +  "\t" 
								+ s.getYear() +  "\t" 
								+ s.getAddress() +  "\t" 
                                + s.getDepartment() +  "\t" 
                                + deptName);

		}
		System.out.println();	//한줄을 띄우는 용도		
	}

	// 성적 정보 출력 메소드
	private static void displayTakes() {
		System.out.println("=================== 4.성적 데이터  =====================");
		for(Takes t : takes) {
			System.out.println(t.getId() + "\t" + t.getSubject() + " \t" + t.getScore());
		}		
	}
	
	// 학과 정보 출력 메소드
	private static void displayDepartment() {
		System.out.println("=================== 3.학과 리스트 =====================");
		for(Department d : departments) {
			System.out.println(d.getId() + "\t" + d.getName() + " \t" + d.getOffice());
		}
		System.out.println();	//한줄을 띄는 용도		
	}


	// 교수 관련 정보 출력 메소드
	private static void displayProfessor() {
		//[문제.1] 일반적인 반복문을 통해서 교수 명단 출력
		System.out.println("[문제.1 일반적인 for문을 통해서 교수 명단 출력]");
		for(int i=0; i<professors.length; i++) {
			System.out.printf("%s  %s  %s  %d  %s %s \n", 
								professors[i].getId(), 
								professors[i].getJumin(), 
								professors[i].getName(), 
								professors[i].getDepartment(), 
								professors[i].getGrade(), 
								professors[i].getHiredate());
		}		
		System.out.println();

		//[문제.2] 향상된 for문을 통해서 교수 명단 출력
		System.out.println("[문제.2 향상된 for문을 통해서 교수 명단 출력]");
		for (Professor professor : professors) {
			System.out.printf("%s  %s  %s  %d  %s %s \n", 
								professor.getId(), 
								professor.getJumin(), 
								professor.getName(), 
								professor.getDepartment(), 
								professor.getGrade(), 
								professor.getHiredate());
		}
		System.out.println();
		
		//[문제.3] 920 학과 교수중 입사년도가 2005년 도인 사람은?
		System.out.println("[문제.3] 920 학과 교수중 입사년도가 2005년 도인 사람은?");
		for (Professor professor : professors) {
			if(professor.getDepartment() == 920 && professor.getHiredate().contains("2005")) {
				System.out.printf("%s  %s  %s  %d  %s %s \n", 
									professor.getId(), 
									professor.getJumin(), 
									professor.getName(), 
									professor.getDepartment(), 
									professor.getGrade(), 
									professor.getHiredate());
			}
		}		
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
			if(student.getAddress().equals("서울") 
					&& student.getYear() == 3) { //서울 사는 3학년
				arrName = arrName + student.getName() + ",";	// 예) 홍길동,이명수,정명훈,
			}			
		}
		String[] resultName = arrName.split(",");
		return resultName;
	}	
}