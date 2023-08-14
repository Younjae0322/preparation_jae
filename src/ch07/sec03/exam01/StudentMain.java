package ch07.sec03.exam01;

public class StudentMain {

	static Student std1 = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
	static Student std2 = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 20);
	static Student std3 = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);
	static Student std4 = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
	static Student std5 = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
	static Student std6 = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
	static Student std7 = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
	static Student std8 = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);

	static Student[] arr = { std1, std2, std3, std4, std5, std6, std7, std8 };

	public static void main(String[] args) {
		Student.infoStart();
		StudentMain.seoul1();
		System.out.println("============================================================");
		System.out.println();
		Student.infoSecond();
		StudentMain.seoul2();
		System.out.println("============================================================");
		System.out.println();
		Student.infoThird();
		StudentMain.seoul3();
	}

	public static void seoul1() {

		for (Student student : arr) {
			System.out.println(student.getId() + "\t" + student.getJumin() + "\t" + student.getName() + "\t"
					+ student.getYear() + "\t" + student.getAddress() + "\t" + student.getDepartment());
		}

	}

	public static void seoul2() {

		for (Student student : arr) {

			char gender = student.getJumin().charAt(7);
			if (gender == '2') {
				System.out.println(student.getId() + "\t" + student.getJumin() + "\t" + student.getName() + "\t"
						+ student.getYear() + "\t" + student.getAddress() + "\t" + student.getDepartment());
			}
		}
	}
	public static void seoul3() {
		for (Student student : arr) {
			String address = student.getAddress();
			int year = student.getYear();
			if (address.equals("서울") && year == 3) {
				System.out.println(student.getName());
			}
		}

	}
}
