package com.javalab.day0815;

public class EmployeeMain {
	public static Employee[] employees = new Employee[10];

	public static void main(String[] args) {
		initData();
		dataMain();
		avgPay();
		nationPay();
	}

	public static void initData() {
		employees[0] = new Employee("A", 28, 400, "KR", 10, "정규");
		employees[1] = new Employee("B", 27, 600, "KR", 15, "정규");
		employees[2] = new Employee("C", 26, 280, "JR", 1, "비정규");
		employees[3] = new Employee("D", 25, 360, "JR", 2, "비정규");
		employees[4] = new Employee("E", 23, 270, "RU", 1, "정규");
		employees[5] = new Employee("F", 27, 390, "AM", 4, "정규");
		employees[6] = new Employee("G", 31, 330, "SI", 3, "정규");
		employees[7] = new Employee("H", 35, 280, "CA", 2, "비정규");
		employees[8] = new Employee("I", 38, 450, "FR", 10, "정규");
		employees[9] = new Employee("J", 45, 600, "JR", 15, "정규");
	}
	public static void dataMain() {
		for(Employee emp : employees) {
			System.out.println(emp.getName() + "\t" + emp.getAge() + "\t"
					           + emp.getPay() + "\t" + emp.getNation() + "\t"
					            + emp.getYear() + "\t" + emp.getWork());
		}
	}
	public static void avgPay() {
		double sum = 0;
		double i = 0;
		for(Employee emp : employees) {
			if(emp.getWork().equals("정규")) {
				sum += emp.getPay();
				i++;				
			}
		}
		double avg =  Math.round((sum/i)*100)/100.0; 
		System.out.println("평균 급여는" + avg + "입니다.");
	}
	public static void nationPay() {
		double sum = 0;
		double i = 0;
		for(Employee emp : employees) {
			if(emp.getNation().equals("JR")) {
				sum += emp.getPay();
				i++;				
			}
		}
		double avg =  Math.round((sum/i)*100)/100.0; 
		System.out.println("일본 직원의 평균 급여는" + avg + "입니다.");
		
	}
}
