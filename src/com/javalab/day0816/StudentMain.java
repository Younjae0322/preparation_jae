package com.javalab.day0816;

public class StudentMain {

	public static void main(String[] args) {
		Students[] student = new Students[4];
		student[0] = new Students("A", 1, 11, 31);
		student[1] = new Students("B", 2, 12, 32);
		student[2] = new Students("C", 3, 13, 33);
		student[3] = new Students("D", 4, 14, 34);

		for(Students std : student) {
			int avgs = std.getKorean() + std.getEnglish() + std.getGermany() / 3;
			System.out.println("이름 : " + std.getName() + "\t 세 과목 평균 점수 : " + avgs);
		}
	}

}
