package com.javalab.day0817.test;

import java.util.ArrayList;
import java.util.List;


public class EmployeeMain {
	public static List<Employee> emps = new ArrayList<Employee>();

	public static void main(String[] args) {
		initData();
		dataMain();
		avgPay();
		nationPay();
	}

	public static void initData() {
		emps.add(new Employee("A", 28, 400, "KR", 10, "정규"));
		emps.add(new Employee("B", 27, 600, "KR", 15, "정규"));
		emps.add(new Employee("C", 26, 280, "JP", 1, "비정규"));
		emps.add(new Employee("D", 25, 360, "JP", 2, "비정규"));
		emps.add(new Employee("E", 23, 270, "RU", 1, "정규"));
		emps.add(new Employee("F", 27, 390, "AM", 4, "정규"));
		emps.add(new Employee("G", 31, 330, "SI", 3, "정규"));
		emps.add(new Employee("H", 35, 280, "CA", 2, "비정규"));
		emps.add(new Employee("I", 38, 450, "FR", 10, "정규"));
		emps.add(new Employee("J", 45, 600, "JP", 15, "정규"));
	}

	public static void dataMain() {
		System.out.println("1. 전 사원 리스트 출력");
		System.out.println("========================================================================================");
		System.out.print(" 이름 \t나이 \t급여 \t지역 \t근무년수\t사원구분\n");
		System.out.println("========================================================================================");
		for (Employee emp : emps) {
			System.out.println(" " + emp.getName() + "\t" + emp.getAge() + "\t" + emp.getPay() + "\t" + emp.getNation() + "\t"
					+ emp.getYear() + "\t" + emp.getWork());
		}
		System.out.println();
	}

	public static void avgPay() {
		double sum = 0;
		int i = 0;
		for (Employee emp : emps) {
			if (emp.getWork().equals("정규")) {
				sum += emp.getPay();
				i++;
			}
		}
		double avg = Math.round((sum / i) * 100) / 100.0;
		System.out.println("1. 정규직 직원들의 평균 급여는 : " + avg + "입니다.");
	}

	public static void nationPay() {
		double sum = 0;
		int i = 0;
		for (Employee emp : emps) {
			if (emp.getNation().equals("JP")) {
				sum += emp.getPay();
				i++;
			}
		}
		double avg = Math.round((sum / i) * 100) / 100.0;
		System.out.println("2. 일본 직원의 평균 급여는 : " + avg + "입니다.");

	}
}
