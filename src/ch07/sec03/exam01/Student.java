package ch07.sec03.exam01;

public class Student {
	private String id;
	private String jumin;
	private String name;
	private int year;
	private String address;
	private int department;
	
	public Student() {
	}
	
	public Student(String id, String jumin, String name, int year, String address, int department) {
		this.id = id;
		this.jumin = jumin;
		this.name = name;
		this.year = year;
		this.address = address;
		this.department = department;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}
	
	public static void infoStart() {
		System.out.println("1. 전체 학생 목록");
		System.out.println("============================================================");
		System.out.println("학번 \t   주민번호  \t 이름 \t학년 \t주소 \t학과");
		System.out.println("============================================================");
		
	}
	public static void infoSecond() {
		System.out.println("2. 여학생 목록");
		System.out.println("============================================================");
		System.out.println("학번 \t   주민번호  \t 이름 \t학년 \t주소 \t학과");
		System.out.println("============================================================");
	}
	public static void infoThird() {
		System.out.println("3. 서울 사는 3학년 명단");
		System.out.println("============================================================");
		System.out.println("이름");
		System.out.println("============================================================");
		
	}

}
