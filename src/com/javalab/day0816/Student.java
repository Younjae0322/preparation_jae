package com.javalab.day0816;

public class Student {

	public static void main(String[] args) {
		String [] names = {"A", "B", "C", "D"};
		int [] korean = {1, 2, 3, 4};
		int [] english = {11, 12, 13, 14};
		int [] germany = {31, 32, 33, 34};
		
		int numStrudents = names.length;
		for (int i = 0; i < numStrudents; i++) {
			int avgs = (korean[i] + english[i] + germany[i] / 3);
			System.out.println("이름 : " + names[i] + "\t 세 과목 평균 점수 : " + avgs);
		}
	}
}
