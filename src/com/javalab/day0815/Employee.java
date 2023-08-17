package com.javalab.day0815;

public class Employee {
	private String name;
	private int age;
	private int pay;
	private String nation;
	private int year;
	private String work;
	
	public Employee() {
		
	}

	public Employee(String name, int age, int pay, String nation, int year, String work) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.nation = nation;
		this.year = year;
		this.work = work;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	

}
