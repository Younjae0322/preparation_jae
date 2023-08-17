package com.javalab.day0817.test;

import java.util.ArrayList;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public Student() {
		super();
	}
	public Student(String name, int korean) {
		super();
		this.name = name;
		this.korean = korean;
	}

	public Student(String name, int korean, int english, int math) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public double ScoreAvg() {
		int totalScore = korean + english + math;
		return (double)totalScore /3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public static void std() {
		ArrayList<Student> std = new ArrayList<Student>();
	
		std.add(new Student("김정민", 82, 90, 70));
		std.add(new Student("조수만", 74, 88, 83));
		std.add(new Student("백금열", 90, 85, 94));
	}
}
