package com.javalab.day0817;

public class Student {

	public static void main(String[] args) {
		String [] names = {"김정민", "조수만", "백금열"};
		int [] korean = {82, 74, 90};
		int [] english = {90, 88, 85};
		int [] math = {70, 83, 94};
		double []avgs = new double[3];
		
		for(String name : names) {
			System.out.printf("이름 : %s\t", name);
		}
		System.out.println();
	
		for (int i = 0; i < names.length; i++) {
			avgs[i] = ScoreAvg(korean[i], english[i], math[i]);
		}
		for(int i = 0; i < avgs.length; i++) {
			System.out.print("평균 점수 : " + avgs[i] + "\t");
		}
		
	}
	public static double ScoreAvg(int sc1, int sc2, int sc3) {
		int totalsc = sc1 + sc2 + sc3;
		double avgs = (double)totalsc/3;
		return (int)(avgs*100)/100.0;
		
	}
}
